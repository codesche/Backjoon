import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int N = Integer.parseInt(br.readLine());
        int sum = N;

        do {
            N = ((N % 10) * 10 + ((N / 10) + (N % 10)) % 10);
            cnt++;
        } while (sum != N);

        System.out.println(cnt);
    }
}