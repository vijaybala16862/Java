public class garbage {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String str = "Object " + i;
            System.out.println(str);
        }

        System.gc();

        System.out.println("Large number of objects created");
    }
}
