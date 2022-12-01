import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = br.readLine().split(" ");

        // N, K
        int N = Integer.parseInt(strArray[0]);
        int K = Integer.parseInt(strArray[1]);

        // N을 K개의 수를 통해 만들때 결과값을 넣을 배열 DP
        int[][] DP = new int[N + 1][K + 1];

        // 1부터 K개까지 반복문을 수행
        for (int i = 1; i <= K; i++) {
            // i개수를 갖고 1을 만들 수 있는 경우의 수는 i개
            // DP[1][2] = (0,1),(1,0)
            // DP[1][3] = (0,0,1)(0,1,0)(1,0,0)
            DP[1][i] = i;
        }

        // 1부터 N개까지 반복문 수행
        for (int i = 1; i <= N; i++) {
            // 1개로 i를 만들 수 있는 경우의 수는 1개
            // DP[2][1] = (2)
            // DP[3][1] = (3)
            DP[i][1] = 1;
        }

        // 1에 대한 처리는 수행했기 때문에 2부터 N과 K개까지의 반복문 수행
        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= K; j++) {
                DP[i][j] = (DP[i][j - 1] + DP[i - 1][j]) % 1000000000;
            }
        }
        // 결과값 출력
        System.out.println(DP[N][K]);
    }
}