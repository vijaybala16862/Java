public class condition{
    public static void main(String[] args) {

        int age = 17;

        // if
        if (age >= 18) {
            System.out.println("Adult");
        }

        // if-else
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible");
        }

        // else-if
        int marks = 85;
        if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 75) {
            System.out.println("B Grade");
        } else {
            System.out.println("C Grade");
        }

        // switch
        int day = 1;
        switch(day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            default -> System.out.println("Invalid Day");
        }
    }
}
