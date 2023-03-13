import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int prev_end_time = 0;
        int N = Integer.parseInt(br.readLine());

        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            time[i][0] = Integer.parseInt(st.nextToken());          // 시작시간
            time[i][1] = Integer.parseInt(st.nextToken());          // 종료시간
        }

        // 끝나는 시간 기준으로 정렬 위해 compare를 재정의
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                // 종료시간 같으면 시작시간이 빠른순으로 정렬
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < N; i++) {
            // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같을 경우 업데이트
            if (prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
