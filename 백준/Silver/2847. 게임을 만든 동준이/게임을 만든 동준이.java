import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N - 2; i >= 0; i--) {
            // N = 4일 경우, 배열의 index는 0, 1, 2, 3이 존재함.
            // 2번과 3번, 1번과 2번, 0번과 1번을 비교하고자 N - 2부터 시작하여 0번까지 반복

            if (arr[i] >= arr[i + 1]) {
                int diff = arr[i] - arr[i + 1] + 1; // N번째 수가 N+1보다 1만큼 작게 하기 위한 차이
                answer += diff;
                arr[i] -= diff;
            }
        }
        System.out.println(answer);
    }
}
