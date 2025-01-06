import java.io.*;
import java.util.Stack;

public class Baekjoon10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>(); // Stack을 사용하여 문제 해결
        
        while (K-- > 0) {
            int number = Integer.parseInt(br.readLine());
            
            if (number == 0) {
                stack.pop(); // 0이 들어오면 스택에서 원소를 제거
            } else {
                stack.push(number); // 0이 아닌 숫자는 스택에 추가
            }
        }
        
        int sum = 0;
        // 스택에 남아 있는 값들의 합을 계산
        for (int num : stack) {
            sum += num;
        }
        
        System.out.println(sum); // 최종 합 출력
    }
}