import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int x = Integer.parseInt(br.readLine());

        int l = 0;
        int r = n - 1;
        int count = 0;

        while (l < r) {
            int sum = arr[l] + arr[r];

            // 합이 x보다 크면
            if (sum > x) {
                r--;
            } else if (sum <= x) {      // 합이 x보다 작거나 같으면
                l++;
            }

            if (sum == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
