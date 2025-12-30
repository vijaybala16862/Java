import java.io.*;
import java.net.*;

public class Network {
    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(5000)) {
            System.out.println("Server started. Waiting for client...");

            try (Socket s = ss.accept()) { // client connected
                System.out.println("Client connected!");

                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String message = br.readLine();

                System.out.println("Client says: " + message);
            }

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
