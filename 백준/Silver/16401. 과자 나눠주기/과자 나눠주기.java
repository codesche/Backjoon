import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 1;
        int right = arr[N - 1];

        while (left <= right) {
            int mid = (left + right) / 2;

            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] >= mid) {
                    cnt += arr[i] / mid;
                }
            }

            // 조카의 수보다 많은 과자를 나누어 줄 수 있다면 과자 길이를 늘릴 수 있다
            if (cnt >= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
