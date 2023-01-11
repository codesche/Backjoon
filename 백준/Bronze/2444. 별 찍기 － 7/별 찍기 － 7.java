import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N + 1; i++) {

            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = N - 1; i > 0; i--) {
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
