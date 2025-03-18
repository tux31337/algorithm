package dfsbfs;

import java.util.*;

public class Baekjoon2178 {
    static int[][] maze;
    static boolean[][] visited;
    static int[][] distance;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        // nextInt()는 숫자만 읽고 개행 문자(\n)는 남겨둠.
        scanner.nextLine(); // 개행 문자 제거 (중요!)

        maze = new int[N][M];
        visited = new boolean[N][M];
        distance = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();

            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }
        bfs(0, 0);
        System.out.println(distance[N - 1][M - 1]);
    }

    static public void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        distance[startX][startY] = 1;

        queue.add(new int[]{0,0});
        visited[0][0] = true;

        // 이동 방향
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            if (x == maze.length - 1 && y == maze[0].length - 1) {
                return;
            }

            System.out.println("x = " + x);
            System.out.println("y = " + y);
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                System.out.println(nextX);
                System.out.println(nextY);

                if(nextX >= 0 && nextY >= 0 && nextX < maze.length && nextY < maze[0].length && maze[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    queue.add(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    distance[nextX][nextY] = distance[x][y] + 1;
                }

            }

            System.out.println("count = " + count);
        }
     }

}
