import java.io.FileWriter;

public class writeexample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("sample.txt")) {
            writer.write("Hello Bala! This is a file writing example.");
            System.out.println("File written successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
