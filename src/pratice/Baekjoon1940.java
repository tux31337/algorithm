package pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1940 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 재료의 개수
        int N = scanner.nextInt();

        // 갑옷을 만드는데 필요한 수
        int M = scanner.nextInt();

        // 결과
        int result = 0;

        // N개의 재료들이 가진 고유한 번호
        int[] uniqueNumbers = new int[N];

        for (int i = 0; i < N; i++) {
            uniqueNumbers[i] = scanner.nextInt();
        }

        Arrays.sort(uniqueNumbers);

        //  1. 갑옷은 두 개의 재료로 만든다.
        //  2. 두 개의 합이 M 이 되면 갑옷 만들기 성공
        //  투포인터로 접근해서 풀어보기
        int start = 0;
        int end = N - 1;

        while (start < end) {
            int sum = uniqueNumbers[start] + uniqueNumbers[end];

            if (sum == M) {
                result++;
                start++;
                end--;
            } else if(sum < M) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(result);
    }
}
