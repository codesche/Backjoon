import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int target_sum = 0;

        while (left <= N && right <= N) {
            if (target_sum >= S && min > (right - left)) {
                min = right - left;
            }

            if (target_sum < S) {
                target_sum += arr[right++];
            } else {
                target_sum -= arr[left++];
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("0");
        } else {
            System.out.println(min);
        }

    }
}