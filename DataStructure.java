import java.util.*;

public class DataStructure {
    public static void main(String[] args) {

        // List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        
        list.add("Banana");

        // Set
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Red");

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Bala", 25);
        map.put("Vijay", 30);

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Queue remove: " + queue.remove());
    }
}
