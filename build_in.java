import java.util.Random;   // built-in package

public class build_in{
    
    public static void main(String[] args) {
        
        // using Random class
        Random rand = new Random();

        int number = rand.nextInt(100);

        System.out.println("Random number: " + number);
    }
}