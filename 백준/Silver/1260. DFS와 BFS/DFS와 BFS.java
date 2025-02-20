import java.util.*;

public class Main {
    static boolean visited[];
    static ArrayList<Integer>[] arrayLists;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 정점의 개수
        int M = scanner.nextInt(); // 간선의 개수
        int V = scanner.nextInt(); // 탐색 시작 정점 번호

        visited = new boolean[N + 1];
        arrayLists = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            arrayLists[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            arrayLists[a].add(b);
            arrayLists[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(arrayLists[i]);
        }

        scanner.close();

        dfs(V);
        Arrays.fill(visited, false);
        System.out.println();

        bfs(V);
    }

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " "); // 방문한 노드 출력

        for (Integer i : arrayLists[node]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (Integer next : arrayLists[node]) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }
    }
}