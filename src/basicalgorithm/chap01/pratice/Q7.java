package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class Q7 {
    static int gaussianSum(int n) {
        return (n + 1) * (n - 1 + 1) * 1/2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 부터 n까지 합을 구합니다.");
        System.out.print("n 값 : ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum+=i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다. ");
        System.out.println("gaussianSum(n) = " + gaussianSum(n));
    }
}
