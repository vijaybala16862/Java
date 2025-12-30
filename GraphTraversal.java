import java.util.*;

public class GraphTraversal {

    private final Map<Integer, List<Integer>> graph = new HashMap<>();

    public void addEdge(int u, int v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public List<Integer> bfsShortestPath(int start, int end) {

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>(); // To reconstruct path
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);
        parent.put(start, null);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (node == end) break;  // Stop when target found

            for (int neighbour : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    parent.put(neighbour, node);
                    queue.add(neighbour);
                }
            }
        }

        List<Integer> path = new ArrayList<>();
        Integer current = end;

        while (current != null) {
            path.add(current);
            current = parent.get(current);
        }

        Collections.reverse(path);
        return path;
    }

    public void dfs(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbour : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbour)) {
                dfs(neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {

        GraphTraversal g = new GraphTraversal();

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 6);

        System.out.println("DFS Traversal starting from node 1:");
        g.dfs(1, new HashSet<>());
        System.out.println("\n");

        System.out.println("Shortest Path from 1 to 6 using BFS:");
        System.out.println(g.bfsShortestPath(1, 6));
    }
}
