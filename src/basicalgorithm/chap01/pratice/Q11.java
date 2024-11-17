package basicalgorithm.chap01.pratice;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int a;
        
        do {
            System.out.print("양의 정수를 입력하세요");
            a = scanner.nextInt();
        } while (a < 0);
        
        int digitCount = (int)Math.log10(a) + 1;

        System.out.println("digitCount = " + digitCount);
        
        int digitCount2 = 0;
        while (a > 0) {
            a = a / 10;
            System.out.println("a = " + a);
            digitCount2++;
        }

        System.out.println("digitCount2 = " + digitCount2);
    }
}
