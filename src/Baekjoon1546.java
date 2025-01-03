import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] scores = new int[N];

        for (int i = 0; i < scores.length; i++) {
            int score = scanner.nextInt();
            scores[i] = score;
        }

        long sum = 0;
        long max = 0;

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        double result = (double) sum * 100 / max /N;

        System.out.println(result);
    }
}
