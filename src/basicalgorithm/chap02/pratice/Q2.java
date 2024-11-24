package basicalgorithm.chap02.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    static void swap(int[] x, int aIndex, int bIndex) {
        System.out.println(x[aIndex] + "과" + x[bIndex] + "을 교환합니다");
        int temp = x[aIndex];
        x[aIndex] = x[bIndex];
        x[bIndex] = temp;
        System.out.println(Arrays.toString(x));
    }

    static void reverse(int[] x) {
        int half = x.length / 2;

        System.out.println(Arrays.toString(x));
        for (int i = 0; i < half; i++) {
            int aIndex = i;
            int bIndex = x.length - i - 1;
            swap(x, aIndex, bIndex);
        }

        System.out.println("역순 정렬을 마쳤습니다.");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();         // 요솟수

        int[] x = new int[num];            // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);        // 배열 a의 요소를 역순으로 정렬

    }
}
