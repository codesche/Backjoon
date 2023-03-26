import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 1 ≤ n ≤ 123,456

    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        get_prime();

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.valueOf(br.readLine());
            if (n == 0) {
                break;
            }

            int count = 0;      // 소수 개수 세기

            for (int i = n + 1; i <= 2 * n; i++) {
                if (!prime[i]) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }

}
