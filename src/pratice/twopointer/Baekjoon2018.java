package pratice.twopointer;

import java.util.Scanner;

public class Baekjoon2018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 자연수 N
        int N = scanner.nextInt();
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;

        while (endIndex != N) {
            if(sum == N) {
                System.out.println("startIndex = " + startIndex);
                System.out.println("endIndex = " + endIndex);
                count++;
                endIndex++;
                sum+=endIndex;
            } else if(sum > N) {
                sum-=startIndex;
                startIndex++;
            } else {
                endIndex++;
                sum+=endIndex;
            }
        }

        System.out.println("count = " + count);
    }
}
