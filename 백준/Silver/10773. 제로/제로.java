import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value == 0) {
                stack.pop();
            } else {
                stack.push(value);
            }

        }
        
        int answer = 0;
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        System.out.println(answer);
    }

}
