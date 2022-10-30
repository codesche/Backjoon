
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(solution(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }

    public static String solution(String str) {
        Stack<Character> stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            // 여는 괄호일 경우 stack에 넣기
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (stack.empty()) {     // 스택이 비어있을 때 닫는 괄호인 경우
                return "NO";
            } else {
                stack.pop();
            }
        }

        // 모든 검사 완료 후 스택이 비어 있으면 YES, 아니면 NO 출력
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}