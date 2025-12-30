public class loop {
    public static void main(String[] args) {

        // 1. for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("For Loop: " + i);
        }

        // 2. while loop
        int j = 1;
        while (j <= 3) {
            System.out.println("While Loop: " + j);
            j++;
        }

        // 3. do-while loop
        int k = 1;
        do {
            System.out.println("Do While Loop: " + k);
            k++;
        } while (k <= 3);

        // 4. Enhanced for loop
        String[] names = {"Bala", "Vijay"};
        for (String n : names) {
            System.out.println("Name: " + n);
        }
    }
}
