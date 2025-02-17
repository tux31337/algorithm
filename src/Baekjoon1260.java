import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1260 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점 개수
        int M = sc.nextInt(); // 간선 개수
        int V = sc.nextInt(); // 시작 정점

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

        dfs(V);

    }

    static void dfs(int node) {
        System.out.print(node + " ");
        visited[node] = true;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
