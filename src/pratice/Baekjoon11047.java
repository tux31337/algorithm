package pratice;
import java.util.Scanner;

public class Baekjoon11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] coinTypes = new int[N];
        for (int i = 0; i < N; i++) {
            coinTypes[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = N - 1; i >= 0 && K > 0; i--) {
            int coin = coinTypes[i];
            if (coin <= K) {
                int num = K / coin;
                count += num;
                K %= coin;
            }
        }

        System.out.println(count);
    }
}
