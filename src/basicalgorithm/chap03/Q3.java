package basicalgorithm.chap03;

import java.util.Scanner;

public class Q3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(a[i] == key) {
                idx[count] = i;
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();

        int[] x = new int[num];
        int[] y = new int[num];


        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }
        System.out.print("검색 값 : ");
        int key = scanner.nextInt();

        int count = searchIdx(x, num, key, y);		// 배열 x안의 값이 ky인 요소를 y에 copy
        System.out.println(count);
    }
}
