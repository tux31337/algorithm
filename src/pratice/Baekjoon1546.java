package pratice;

import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        // 시험 본 과목의 개수 N  N <= 1000
        int N = scanner.nextInt();

        // 시험 점수 입력 받을 배열 선언
        int[] scores = new int[N];

        int M = 0;

        // 시험 점수 입력 받기, 최댓값
        for (int i = 0; i < N; i++) {
            scores[i]+=scanner.nextInt();
            M = Math.max(scores[i], M);
        }

        // 시험 점수 조작 및 합계 구하기
        for (int score : scores) {
            sum+=((double) score/M)*100;
        }
        
        // 시험 본 사람 성적  100 보다 작거나 음이 아닌 정수, 적어도 하나의 값은 0 보다 크다.
        // 새로운 평균 출력
        System.out.println( sum / scores.length);
    }
}
