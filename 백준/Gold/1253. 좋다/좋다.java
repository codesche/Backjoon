import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int result = 0;

        for (int k = 0; k < arr.length; k++) {
            int i = 0;          // 시작 지점
            int j = N - 1;      // 끝 지점

            // 좋은 수 찾기 위한 find 변수 생성
            int find = arr[k];

            while (i < j) {
                if (arr[i] + arr[j] == find) {
                    // find가 서로 다른 두 수의 합이어야 함을 체크 (다른 배열 요소끼리들의 합인지의 여부 체크)
                    if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    } else {
                        cnt++;
                        break;
                    }
                }
                else if (arr[i] + arr[j] < find) {
                    i++;
                } else if (arr[i] + arr[j] > find) {
                    j--;
                }
            }
        }
        System.out.println(cnt);
    }
}
