import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 수의 개수 입력
        int N = Integer.parseInt(br.readLine());

        // Counting할 변수
        int count = 0;

        /// 수 데이터 저장 배열
        long arr[] = new long[N];

        // 배열 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(arr);

        for (int k = 0; k < N; k++) {
            // 찾고자 하는 값
            long find = arr[k];

            // 포인터 i - 시작
            int i = 0;

            // 포인터 j - 끝
            int j = N - 1;

            while (i < j) {
                if (arr[i] + arr[j] == find) {
                    // find는 서로 다른 두 수의 합인지의 여부를 확인
                    if (i == k) {               // 같으면 i 증가
                        i++;
                    } else if (j == k) {        // 같으면 j 감소
                        j--;
                    } else {                    // 두 포인터 i, j가 k가 아닐 때 결과값에 반영 (i != k && j != k)
                        count++;
                        break;
                    }
                } else if (arr[i] + arr[j] < find) {        // 합이 찾고자 하는 값보다 작으면 i 증가
                    i++;
                } else {                                    // 합이 찾고자 하는 값보다 크면 j 감소
                    j--;
                }
            }
        }
        // 결과값 출력
        System.out.print(count);
    }
}
