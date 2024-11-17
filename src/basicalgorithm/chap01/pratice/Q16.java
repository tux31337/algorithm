package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class Q16 {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int starRepeatNum = (i -  1) * 2 +1;
            System.out.println("*".repeat(starRepeatNum));

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        spira(n);
    }
}
