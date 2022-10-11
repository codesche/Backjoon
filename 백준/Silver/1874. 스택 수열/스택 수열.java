import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        // 오름차순 수
        int num = 1;
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            int sequence_value = arr[i];

            // 현재 수열 값 >= 오름차순 자연수 : 값이 같아질 때까지 push() 수행
            if (sequence_value >= num) {
                while (sequence_value >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }

            // 현재 수열 값 < 오름차순 자연수 : pop()을 수행하여 수열 원소를 꺼낸다
            else {
                int n = stack.pop();

                // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 클 경우 수열을 출력할 수 없음
                if (n > sequence_value) {
                    System.out.println("NO");
                    result = false;
                    break;
                }

                else {
                    sb.append("-\n");
                }
            }
        }
        if (result) {
            System.out.println(sb.toString());
        }
    }
}
