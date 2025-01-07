import java.io.*;
import java.util.Stack;

public class Baekjoon28278 {

    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            processCommand(br.readLine());
        }

        br.close();
        System.out.print(sb);
    }

    static void processCommand(String query) {
        char command = query.charAt(0); // 명령어의 첫 문자
        switch (command) {
            case '1': // push X
                stack.push(Integer.parseInt(query.substring(2)));
                break;
            case '2': // pop
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
                break;
            case '3': // size
                sb.append(stack.size()).append('\n');
                break;
            case '4': // empty
                sb.append(stack.isEmpty() ? 1 : 0).append('\n');
                break;
            case '5': // top
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
                break;
        }
    }
}