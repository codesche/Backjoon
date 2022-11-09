import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] DP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        DP = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            if (!DP[i - 1]) {
                DP[i] = true;
            }
        }

        if (DP[N]) {
            System.out.print("SK");
        } else {
            System.out.print("CY");
        }
    }
}
