import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자의 개수 N
        int N = scanner.nextInt();

        // 숫자
        String number = scanner.next();

        // 결과
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum+=number.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
