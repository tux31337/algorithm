package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class SumWhilePrintI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 부터 n까지 합을 구합니다.");
        System.out.print("n 값 : ");
        int n = scanner.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum+=i;
            i++;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다. ");
        System.out.println("i의 값은 " + i + "(으)로 됩니다.");
    }
}
