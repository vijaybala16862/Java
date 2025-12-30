public class function {
    // 1. No input, no return
    public void message() {
        System.out.println("Welcome Bala!");
    }
    // 2. Input only
    public void greet(String name) {
        System.out.println("Hello " + name);
    }
    // 3. Return only
    public int getYear() {
        return 2025;
    }
    // 4. Input + Return
    public int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {

        function obj = new function();

        obj.message();
        obj.greet("Bala");

        int year = obj.getYear();
        System.out.println("Year: " + year);

        int result = obj.multiply(5, 4);
        System.out.println("Multiplication: " + result);
    }
}
