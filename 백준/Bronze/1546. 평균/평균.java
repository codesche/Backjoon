import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int i = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            A[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        double max = 0;
        double sum = 0;

        for (int j = 0; j < A.length; j++) {
            if (A[j] > max) {
                max = A[j];
            }
            sum += A[j];
        }
        System.out.print((sum * 100) / max / N);
    }
}
