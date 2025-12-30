import java.util.*;
import java.util.stream.*;

public class stream {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 25, 30, 45, 50);

        // 1. Filter
        List<Integer> filtered = nums.stream()
        .filter(n -> n > 30)
        .collect(Collectors.toList());

        // 2. Map
        List<Integer> squares = nums.stream()
        .map(n -> n * n)
        .collect(Collectors.toList());

        // 3. Sort
        List<Integer> sorted = nums.stream()
        .sorted()
        .collect(Collectors.toList());

        // 4. Reduce
        int sum = nums.stream()
        .reduce(0, (a, b) -> a + b);

        System.out.println("Filtered: " + filtered);
        System.out.println("Squares: " + squares);
        System.out.println("Sorted: " + sorted);
        System.out.println("Sum: " + sum);
    }
}
