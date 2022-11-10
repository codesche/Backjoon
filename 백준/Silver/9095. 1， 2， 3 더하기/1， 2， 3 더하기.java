import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] DP = new int[11];

            DP[1] = 1;
            DP[2] = 2;
            DP[3] = 4;

            for (int j = 4; j <= N; j++) {
                DP[j] = DP[j - 1] + DP[j - 2] + DP[j - 3];
            }
            bw.write(DP[N] + "\n");
        }
        bw.flush();
    }
}
