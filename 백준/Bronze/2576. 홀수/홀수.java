import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 7; i++) {
            if (arr[i] % 2 != 0) {
                cnt++;
                if (min > arr[i]) {
                    min = arr[i];
                }

                sum += arr[i];
            }
        }

        if (cnt == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
