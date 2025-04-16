package pratice.twopointer;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon3273 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        // 수열의 개수 N
        int N = scanner.nextInt();


        // 수열
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // 타겟 값 x
        int x = scanner.nextInt();

        Arrays.sort(arr);


        int leftIndex = 0;
        int rightIndex = N -1;
        int result = 0;

        while (leftIndex < rightIndex) {
            int sum = arr[leftIndex] + arr[rightIndex];
            if (sum == x) {
                result++;
                leftIndex++;
                rightIndex--;
            } else if (sum < x) {
               leftIndex++;
            } else {
                rightIndex--;
            }
        }

        System.out.println(result);

        scanner.close();
    }
}
