import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //dp : i일 때 가질 수 있는 항의 최소개수
        int[] dp = new int[N + 1];

        // 점화식
        // i번째 수에서 제곱수를 뺀 후 +1 해줌
        // 빼는 제곱수는 개수 1로 취급
        // dp[i] = min(dp[i], dp[i - j^2] + 1)

        for (int i = 1; i <= N; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - (j * j)] + 1);
            }
        }
        System.out.println(dp[N]);
    }
}
