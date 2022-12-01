import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long a = 0;
        long b = 1;
        for (int i = 1; i < N; i++) {
            long temp = a + b;
            b = a;
            a = temp;
        }
        System.out.println(a + b);
    }
}