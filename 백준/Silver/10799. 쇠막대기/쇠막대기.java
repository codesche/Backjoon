import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {           // 열린 괄호인 경우 스택에 추가
                stack.push('(');
                continue;
            }

            if (input.charAt(i) == ')') {           // 닫힌 괄호인 경우
                stack.pop();                        // 일단 stack에서 pop실행

                if (input.charAt(i - 1) == '(') {   // 그 전 괄호가 열린 괄호인 경우
                    result += stack.size();         // 현재 stack의 사이즈만큼 더해줌
                } else {                            // 그 전 괄호가 닫힌 괄호이면 레이저가 아님
                    result++;                       // 단순히 1을 더해줌
                }
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
