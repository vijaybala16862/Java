import java.util.*;

class Box<T> {
    T data;
    Box(T data) {
        this.data = data;
    }
    void show() {
        System.out.println("Data: " + data);
    }
}

public class generics {
    public static void main(String[] args) {

        Box<String> b1 = new Box<>("Hai Bluescope");
        Box<Integer> b2 = new Box<>(200);

        b1.show();
        b2.show();

        List<Double> list = new ArrayList<>();
        list.add(22.5);
        list.add(30.8);

        System.out.println("List: " + list);
    }
}
