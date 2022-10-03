import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // n이 4또는 7인 경우
        if (N == 4 || N == 7) {
            System.out.println(-1);
        } else if (N % 5 == 0) {        // n이 5의 배수인 경우
            System.out.println(N / 5);
        } else if (N % 5 == 1 || N % 5 == 3) {    // n이 5의 배수 + 1 or 5의 배수 + 3인 경우
            System.out.println((N / 5) + 1);
        } else if (N % 5 == 2 || N % 5 == 4) {    // n이 5의 배수 + 2 또는 5의 배수 + 4인 경우
            System.out.println((N / 5) + 2);
        }

    }
}
