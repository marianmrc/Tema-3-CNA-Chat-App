import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.ChatMessageService;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        try {
            Server server = ServerBuilder
                    .forPort(1337)
                    .addService(new ChatMessageService())
                    .build();

            server.start();

            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}