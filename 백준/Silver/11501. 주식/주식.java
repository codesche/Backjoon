import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> list = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            int max = Integer.MIN_VALUE;
            long sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = arr.length - 1; j >= 0; j--) {
                if (max < arr[j]) {
                    max = arr[j];
                }

                if (max > arr[j]) {
                    sum += (max - arr[j]);
                }
            }
            list.add(sum);
        }

        for (long num : list) {
            System.out.println(num);
        }
    }
}
