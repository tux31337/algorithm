package basicalgorithm.chap02.pratice;

import java.util.Scanner;

public class Q5 {
    static void rCopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;

        for (int i = 0; i < num; i++) {
            a[i] = b[b.length - i - 1];
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 요솟수는  : ");
        int numa = stdIn.nextInt();		// 요솟수
        int[] a = new int[numa];			// 요솟수가 numa인 배열
        for (int i = 0; i < numa; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("b의 요솟수는  : ");
        int numb = stdIn.nextInt();		// 요솟수
        int[] b = new int[numb];			// 요솟수가 numb인 배열
        for (int i = 0; i < numb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }

        rCopy(a, b);			// 배열 b의 모든 요소를 배열 a에 copy

        System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");
        for (int i = 0; i < numa; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
