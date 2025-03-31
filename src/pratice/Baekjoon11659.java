package pratice;

import java.util.Arrays;
import java.util.Scanner;

//수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램
public class Baekjoon11659 {
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////
////        // 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M
////        int N = scanner.nextInt();
////        int M = scanner.nextInt();
////
////        // 둘째 줄에는 N개의 수가 주어진다.
////        int[] numbers = new int[N];
////        int[] results = new int[M];
////        for (int i = 0; i < N; i++) {
////            numbers[i] = scanner.nextInt();
////        }
////
////        for (int x = 0; x < M; x++) {
////            int start = scanner.nextInt();
////            int end = scanner.nextInt();
////
////            results[x] = calculateRangeSum(start, end, numbers);
////        }
////
////        // 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j
////        for (int result : results) {
////            System.out.println(result);
////        }
////    }
////
////    /**
////     *
////     * @param start - 인덱스 시작 번호 + 1
////     * @param end - 인덱스 마지막 번호 + 1
////     * @param numbers - 숫자리스트
////     * @return
////     */
////    static int calculateRangeSum(int start, int end, int[] numbers) {
////        int sum = 0;
////
////        for (int i = start - 1; i <= end - 1; i++) {
////            sum+=numbers[i];
////        }
////
////        return sum;
////    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 누적 합 배열 (0번 인덱스를 사용하기 위해 N+1 크기로 선언)
        int[] prefixSum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + scanner.nextInt();
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            stringBuilder.append(prefixSum[end] - prefixSum[start - 1]).append('\n');
        }

        System.out.println(stringBuilder);
    }
}
