import java.util.*;

public class collection {
    public static void main(String[] args) {

        // List
        List<String> list = new ArrayList<>();
        list.add("Bala");
        list.add("Sathesh");

        // Set
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Bala", 25);
        map.put("Sathesh", 30);


        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
    }
}
