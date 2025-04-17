package pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon12891 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DNA 문자열 길이
        int S = scanner.nextInt();

        // 비밀번호로 사용할 부분문자열의 길이
        int P = scanner.nextInt();

        int result = 0;




        char[] dnaCharSet = scanner.next().toCharArray();

        // 현재 비밀번호의 상태
        int[] restriction = new int[4];

        // 비밀번호 체크 배열
        int[] currentCharCount = new int[4];



        for (int i = 0; i < 4; i++) {
            restriction[i] = scanner.nextInt();
        }

        // 첫 번째 윈도우에 대한 문자 카운트 계산
        for (int i = 0; i < P; i++) {
            if (dnaCharSet[i] == 'A') {
                currentCharCount[0]++;
            } else if(dnaCharSet[i] == 'C') {
                currentCharCount[1]++;
            } else if(dnaCharSet[i] == 'G') {
                currentCharCount[2]++;
            } else if (dnaCharSet[i] == 'T') {
                currentCharCount[3]++;
            }
        }

        // 첫 번째 윈도우에 대한 체크
        if (passwordCheck(currentCharCount, restriction)) {
            result++;
        }

        // 슬라이딩 윈도우 루프 (인덱스 P부터 S까지)
        for (int i = P; i < S; i++) {
            // 이전 윈도우의 첫 번째 문자 빼기 (왼쪽 끝)
            char outChar = dnaCharSet[i - P];
            if (outChar == 'A') currentCharCount[0]--;
            else if (outChar == 'C') currentCharCount[1]--;
            else if (outChar == 'G') currentCharCount[2]--;
            else if (outChar == 'T') currentCharCount[3]--;

            // 새로운 윈도우의 마지막 문자 추가하기 (오른쪽 끝)
            char inChar = dnaCharSet[i];
            if (inChar == 'A') currentCharCount[0]++;
            else if (inChar == 'C') currentCharCount[1]++;
            else if (inChar == 'G') currentCharCount[2]++;
            else if (inChar == 'T') currentCharCount[3]++;

            // 새로운 윈도우가 조건을 만족하는지 체크
            if (passwordCheck(currentCharCount, restriction)) {
                result++;
            }
        }


        System.out.println(result);
    }


    static boolean passwordCheck(int[] currentCharCount, int[] restriction) {
        // A, C, G, T 각각의 개수가 제한 조건을 만족하는지 확인
        for (int i = 0; i < 4; i++) {
            if (currentCharCount[i] < restriction[i]) {
                return false; // 하나라도 최소 개수를 만족하지 않으면 false 반환
            }
        }
        return true; // 모든 조건을 만족하면 true 반환
    }




}
