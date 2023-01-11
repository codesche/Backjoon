import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = N; i > 0; i--) {
            for (int j = N ; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}