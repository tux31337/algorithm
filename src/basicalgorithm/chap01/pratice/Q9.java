package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        do {
            System.out.print("a값 : ");
            a = scanner.nextInt();
            System.out.print("b값 : ");
            b = scanner.nextInt();
            if(a > b) {
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        }while (a > b);

        System.out.println("b - a 는" +  (b - a) + "입니다.");
    }
}
