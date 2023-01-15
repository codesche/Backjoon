
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();         // 출력할 결과물 저장
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int start = 0;
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                for (int j = start + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = value;                  // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }

            // top에 있는 원소가 입력받은 값과 같지 않은 경우
            else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);

    }

}
