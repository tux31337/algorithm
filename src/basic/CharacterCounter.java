package basic;

import java.util.Scanner;

public class CharacterCounter {
    static int solution(String str, char t) {
        int count = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);

//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == t) {
//                count++;
//            }
//        }

        for (char x : str.toCharArray()) {
            if (x == t) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char searchCharacter = scanner.next().charAt(0);

        int count = solution(input, searchCharacter);
        System.out.println(count);
    }
}
