package pratice;

import java.util.Scanner;

public class Baekjoon12891 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DNA 문자열 길이
        int S = scanner.nextInt();
        char[] dnaCharSet = new char[S];


        // 비밀번호로 사용할 부분문자열의 길이
        int P = scanner.nextInt();


        String dnaString = scanner.next();

        for (int i = 0; i < S; i++) {
            dnaCharSet[i] = dnaString.charAt(i);
        }


        int[] restriction = new int[4];

        for (int i = 0; i < 4; i++) {
            restriction[i] = scanner.nextInt();
        }

        int[] charCount = new int[4];

    }

    private static int charToIndex(char c) {
        switch (c) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
            default: return -1; // 예외 처리
        }
    }
}
