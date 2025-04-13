package pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 입력 받기
        int N = sc.nextInt();

        ArrayList<Integer> primes = getPrimes(N);

        System.out.println("Arrays.toString(primes.toArray()) = " + Arrays.toString(primes.toArray()));
        
        int count = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < primes.size(); right++) {
            // 오른쪽 포인터 이동 시 값 추가
            sum += primes.get(right);

            // 합이 N보다 크면 왼쪽 포인터 이동시키며 값 빼기
            while (sum > N) {
                sum -= primes.get(left++);
            }

            // 합이 N과 같으면 카운트 증가
            if (sum == N) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

    static ArrayList<Integer> getPrimes(int N) {
        boolean[] isComposite = new boolean[N + 1];
        ArrayList<Integer> primes = new ArrayList<>();

        isComposite[0] = true;
        isComposite[1] = true;

        for (int i = 2; i * i <= N; i++) {
            if (!isComposite[i]) {
                // i의 배수들을 모두 합성수로 표시
                for (int j = i * i; j <= N; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (!isComposite[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

}
