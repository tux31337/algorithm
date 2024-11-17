package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class Q8 {
    static int gaussianSum(int a, int b) {
        int n = a > b ? a - b  + 1 : b- a + 1;
        return (n * (a + b)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a 부터 b까지 합을 구합니다.");
        System.out.print("a 값 : ");
        int a = scanner.nextInt();
        System.out.print("b 값 : ");
        int b = scanner.nextInt();

        System.out.println("gaussianSum(n) = " + gaussianSum(a, b));
    }
}
