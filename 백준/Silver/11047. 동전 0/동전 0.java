import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = 0;

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] <= K) {                  // 현재 동전의 가치가 K보다 작거나 같으면 구성에 추가
                result += (K / arr[i]);
                K = K % arr[i];                 // K를 현재 동전을 사용하고 남은 금액으로 갱신
            }
        }
        System.out.println(result);
    }
}
