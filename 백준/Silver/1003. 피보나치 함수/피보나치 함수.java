import java.util.Scanner;

public class Main {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = in.nextInt();

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = in.nextInt();
            fibonacci(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
        }
        System.out.print(sb);
    }

    public static Integer[] fibonacci(int N) {
        if (dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
            dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
        }

        // N에 대한 0과 1, 즉 [N][0]과 [N][1]을 담고있는 [N]을 반환
        return dp[N];
    }
}
