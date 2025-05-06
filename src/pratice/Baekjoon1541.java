package pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1541 {
    public static void main(String[] args) {
        // 전략
        // - 기준으로 쪼갬
        // 그리고 나머지는 더하기

        Scanner scanner = new Scanner(System.in);

        String calc = scanner.next();

        String[] splitCalc = calc.split("-");

        System.out.println("Arrays.toString(splitCalc) = " + Arrays.toString(splitCalc));

        int result = sum(splitCalc[0]);

        for (int i = 1; i < splitCalc.length; i++) {
            result-=sum(splitCalc[i]);
        }

        System.out.println("result = " + result);
    }

    private static int sum(String expr) {
        int total = 0;

        for (String s : expr.split("\\+")) {
            total+=Integer.parseInt(s);
        }

        return total;
    }
}
