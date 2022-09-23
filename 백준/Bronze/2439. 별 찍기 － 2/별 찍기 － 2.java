import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2439번 - replay star
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            for (int j = N; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
