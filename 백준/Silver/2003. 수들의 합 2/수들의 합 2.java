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

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;

        while (true) {
            // 부분배열 합이 M보다 크거나 같으면 기존 합에서 arr[left]에 해당하는 값을 빼준 다믕
            // Left 인덱스 1 증가시켜줌
            if (sum >= M) {
                sum -= arr[left++];
            } else if (right == N) {        // right 인덱스가 배열 길이와 같으면 break
                break;
            } else if (sum < M) {           // 합이 M보다 작은 경우, 배열 요소값 더해준 다움 right 인덱스 1 증가시켜줌
                sum += arr[right++];
            }
            
            // left ~ right 까지의 부분배열의 합이 M이면 결과 카운트 + 1
            if (sum == M) {
                count++;
            }
        }
        System.out.println(count);
    }
}
