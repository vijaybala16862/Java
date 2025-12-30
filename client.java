import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 5000)) {

            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            pw.println("Hello Server, I am Bala!");

            System.out.println("Message sent to server.");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
