import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int n, int k, int[] arr) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // 누적 합 구하기
            sum += arr[i];
            
            // 처음의 누적된 합의 값을 max로 지정
            if (i == k - 1) {
                max = sum;
            }
            
            // 처음 길이 벗어나면 한 칸씩 밀어주면서 비교
            if (i >= k) {
                sum -= arr[i - k];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());       // 온도 입력
        int K = Integer.parseInt(st.nextToken());       // 연속일수 입력
        int[] arr = new int[N];                         

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        System.out.println(T.solution(N, K, arr));
    }
}
