import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            
            // 초기화
            int[][] stickers = new int[2][N + 1];
            int[][] dp = new int[2][N + 1];
            for (int j = 0; j < 2; j++) {
                String[] inputs = br.readLine().split(" ");
                for (int k = 1; k <= N; k++) {
                    stickers[j][k] = Integer.parseInt(inputs[k - 1]);
                }
            }
            // 첫번째 칼럼은 자기 자신이 최대이므로 자기 자신으로 초기화
            dp[0][1] = stickers[0][1];
            dp[1][1] = stickers[1][1];

            for (int j = 2; j <= N; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + stickers[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + stickers[1][j];
            }
            System.out.println(Math.max(dp[0][N], dp[1][N]));
        }
    }
}