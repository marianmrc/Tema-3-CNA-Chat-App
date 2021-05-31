package services;

import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import proto.chat.ChatMessageServiceGrpc;
import proto.chat.ChatMessageServiceOuterClass.ChatMessage;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ChatMessageService extends ChatMessageServiceGrpc.ChatMessageServiceImplBase {
    final HashSet<StreamObserver<ChatMessage>> observers = new LinkedHashSet<>();

    @Override
    public StreamObserver<ChatMessage> chat(StreamObserver<ChatMessage> responseObserver) {
        synchronized (observers) {
            observers.add(responseObserver);
        }

        return new StreamObserver<ChatMessage>() {
            @Override
            public void onNext(ChatMessage chatMessage) {
                String message = chatMessage.getMessage();
                String from = chatMessage.getFrom();

                for (StreamObserver<ChatMessage> observer : observers) {
                    try {
                        observer.onNext(ChatMessage.newBuilder()
                                .setMessage(message).setFrom(from).build());
                    } catch (StatusRuntimeException e) {
                        synchronized (observers) {
                            observers.remove(responseObserver);
                        }
                    }
                }
            }

            @Override
            public void onError(Throwable throwable) {
                synchronized (observers) {
                    observers.remove(responseObserver);
                }
            }

            @Override
            public void onCompleted() {
                synchronized (observers) {
                    observers.remove(responseObserver);
                }
            }
        };
    }
}


