package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            num = scanner.nextInt();
        } while (num < 0);

        for (int i = 0; i < num; i++) {
            System.out.println("*".repeat(num));
        }
    }
}
