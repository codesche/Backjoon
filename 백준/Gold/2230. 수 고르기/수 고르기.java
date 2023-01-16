
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int i = 0;
        int j = 0;
        int answer = Integer.MAX_VALUE;

        // 투 포인터 알고리즘
        while (i < N) {
            if (arr[i] - arr[j] < M) {
                i++;
                continue;
            }

            if (arr[i] - arr[j] == M) {
                answer = M;
                break;
            }

            answer = Math.min(answer, arr[i] - arr[j]);
            j++;
        }

        System.out.println(answer);

    }

}
