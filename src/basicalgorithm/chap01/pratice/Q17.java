package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class Q17 {
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf(" ");
            }

            int repeatN = (i - 1) * 2 + 1;
            String s = String.valueOf(i);

            System.out.println(s.repeat(repeatN));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        npira(n);
    }
}
