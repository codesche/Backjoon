import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int input_num = Integer.parseInt(st.nextToken());       // 학생 수
            int[] arr = new int[input_num];
            double sum = 0;     // 성적 누적 합 변수

            // 성적 입력 부분
            for (int j = 0; j < input_num; j++) {
                int val = Integer.parseInt(st.nextToken());         // 성적 저장
                arr[j] = val;
                sum += val;     // 성적 누적 합
            }

            double avg = (sum / input_num);
            double count = 0;                   // 평균 넘는 학생 수 변수

            // 평균 넘는 학생 비율 찾기
            for (int j = 0; j < input_num; j++) {
                if(arr[j] > avg) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count / input_num) * 100);
        }
    }
}
