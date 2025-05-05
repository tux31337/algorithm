package pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] times = new int[N];

        for (int i = 0; i < N; i++) {
            times[i] = scanner.nextInt();
        }
        
        Arrays.sort(times);

        System.out.println("Arrays.toString(times) = " + Arrays.toString(times));

        int waitSum = 0;
        int totalWaitTime = 0;
        for (int time : times) {
            waitSum+=time;
            totalWaitTime+=waitSum;
        }

        System.out.println("waitSum = " + waitSum);
        System.out.println("totalWaitTime = " + totalWaitTime);
    }
}
