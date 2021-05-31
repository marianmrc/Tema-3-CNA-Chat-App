package services;

import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import proto.log.LogServiceGrpc;
import proto.log.LogServiceOuterClass;
import proto.log.LogServiceOuterClass.UserState;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LogService extends LogServiceGrpc.LogServiceImplBase {
    final HashSet<StreamObserver<LogServiceOuterClass.UserState>> observers = new LinkedHashSet<>();

    @Override
    public StreamObserver<UserState> log(StreamObserver<UserState> responseObserver) {
        synchronized (observers) {
            observers.add(responseObserver);
        }

        return new StreamObserver<UserState>() {
            @Override
            public void onNext(UserState userState) {
                String username = userState.getUsername();
                String state = userState.getState();

                if (state.equals("connected")) {
                    System.out.println(username + " connected");
                }
                else {
                    System.out.println(username + " disconnected");
                }

                for (StreamObserver<UserState> observer : observers) {
                    try {
                        observer.onNext(UserState.newBuilder()
                                .setUsername(username).setState(state).build());
                    } catch (StatusRuntimeException e) {
                        synchronized (observers) {
                            observers.remove(responseObserver);
                        }
                    }
                }
            }

            @Override
            public void onError(Throwable throwable) {
               
            }

            @Override
            public void onCompleted() {

            }
        };
    }
}
