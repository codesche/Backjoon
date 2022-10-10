import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;          // N이 15인 경우를 고려하여 1로 초기화
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;

        while (end_idx != N) {
            if (sum == N) {
                count++;
                end_idx++;
                sum += end_idx;
            }

            else if (sum > N) {
                sum -= start_idx;
                start_idx++;
            }

            else if (sum < N) {
                end_idx++;
                sum += end_idx;
            }
        }
        System.out.println(count);
    }
}
