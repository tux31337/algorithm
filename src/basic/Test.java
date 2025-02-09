package basic;

import java.util.Scanner;

public class Test {
    static String solution(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 65 && ch <= 90) {
                result.append((char) (ch + 32));
            } else {
                result.append((char) (ch - 32));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        String result = solution(text);
        System.out.println(result);
    }
}
