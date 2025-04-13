package pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 수열 개 수
        int N = scanner.nextInt();

        // 찾아야 할 합의 값
        int M = scanner.nextInt();

        int result = 0;

        // 수열을 담을 배열과 수열을 입력
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int startIndex = 0;
        int endIndex =  0;



        while (endIndex != N) {
            int sum = calculateSum(startIndex, endIndex, arr);

            if (sum < M) {
                endIndex++;
            } else if (sum == M) {
                result++;
                endIndex++;
            } else {
                startIndex++;
            }
        }

        System.out.println(result);
    }

    static int calculateSum(int startIndex, int endIndex, int[] arr) {
        int sum = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            sum+=arr[i];
        }

        return sum;
    }
}
