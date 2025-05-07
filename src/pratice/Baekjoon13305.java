package pratice;

import java.util.Scanner;

public class Baekjoon13305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 도시의 개수
        int N = scanner.nextInt();

        // 도로의 길이 N - 1
        int[] pathLengths = new int[N - 1];

        // 도시마다 기름 가격
        int[] cityPrices = new int[N];

        for (int i = 0; i < N - 1; i++) {
            pathLengths[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            cityPrices[i] = scanner.nextInt();
        }

        // 가장 낮은 기름 값을 저장, 처음에는 무조건 0번째
        int minPrice = cityPrices[0];

        long result = 0L;

        for (int i = 0; i < N - 1; i++) {
            // 현재 도시 기름 가격이 더 작으면 minPrice 값 변경
            if (minPrice > cityPrices[i]) {
                minPrice = cityPrices[i];
            }

            // 그 후 가격 계산
            result+=((long) pathLengths[i] * minPrice);
        }

        System.out.println(result);
    }
}
