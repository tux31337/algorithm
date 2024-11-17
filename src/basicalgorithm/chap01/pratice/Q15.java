package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class Q15 {
    // 왼쪽 아래가 직각 이등변 삼각형
    static void triangleLB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // 왼쪽 위가 직각 이등변 삼각형
    static void triangleLU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }



    // 오른쪽 아래가 직각 이등변 삼각형
    static void triangleRB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.printf(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 위가 직각 이등변 삼각형
    static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > n - i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        triangleLB(n);
        triangleLU(n);
        triangleRB(n);
        triangleRU(n);
    }
}
