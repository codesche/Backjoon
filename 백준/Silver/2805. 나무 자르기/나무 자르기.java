import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        StringTokenizer str = new StringTokenizer(br.readLine());
        int left = 0;
        int right = -1;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
            right = Math.max(right, arr[i]);
        }

        while (left <= right) {
            int mid = (left + right) / 2;
            long tree = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > mid) {
                    tree += arr[i] - mid;
                }
            }
            if (tree >= M) {
                left = mid + 1;
            } else if (tree < M) {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
