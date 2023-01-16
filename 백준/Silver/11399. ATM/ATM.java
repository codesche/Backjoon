import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int prev = 0;       // 이전까지 대기시간 누적합
        int sum = 0;        // 사람별 대기시간 총합

        for (int i = 0; i < N; i++) {
            sum += prev + arr[i];

            prev += arr[i];
        }

        System.out.println(sum);
    }

}
