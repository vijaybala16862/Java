public class memory {

    static void show() {
        int x = 10;
        String name = "Bala";
        Student st = new Student();
        System.out.println("x = " + x + ", name = " + name + ", Student = " + st);
    }

    public static void main(String[] args) {
        show();
    }
}
class Student {
    int id;
    
    Student() {
        this.id = 1;
    }
    
    public int getId() {
        return id;
    }
}
