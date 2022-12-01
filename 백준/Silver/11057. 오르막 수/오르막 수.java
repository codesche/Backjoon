import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        int[][] dp = new int[1001][10];              // dp[자릿수][숫자 가장 앞자리수]

        dp[1][0] = 1;       // 1자리수, 0으로 시작
        dp[1][1] = 1;       // 1자리수, 1로 시작
        dp[1][2] = 1;
        dp[1][3] = 1;
        dp[1][4] = 1;
        dp[1][5] = 1;
        dp[1][6] = 1;
        dp[1][7] = 1;
        dp[1][8] = 1;
        dp[1][9] = 1;

        for (int i = 2; i < N + 1; i++) {
            dp[i][9] = 1;               // 9로 시작하는 오르막 수는 항상 1가지
            for (int j = 8; j >= 0; j--) {
                dp[i][j] = dp[i - 1][j] + dp[i][j + 1] % 10007;
            }
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[N][i];
        }

        System.out.println(sum % 10007);

    }
}