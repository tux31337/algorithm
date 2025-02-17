import java.util.*;

public class Baekjoon12178 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        Arrays.toString(graph);

        for (int i = 1; i <= N; i++) {
            System.out.println(i + " -> " + graph[i]);
        }

        sc.close();


    }
}
