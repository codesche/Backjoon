import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] DP = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            DP[i] = !DP[i - 1];
        }

        String answer = DP[N] ? "SK" : "CY";
        System.out.println(answer);
    }
}
