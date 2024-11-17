package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;

        do {
            System.out.println("양의 정수를 입력하세요");
            a = scanner.nextInt();

        } while (a < 0);
    }
}
