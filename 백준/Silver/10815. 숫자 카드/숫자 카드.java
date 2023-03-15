import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());

            // uppderBound와 lowerBound의 차이 값을 구하기
            sb.append(upperBound(A, key) - lowerBound(A, key)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int key) {
        int lower = 0;
        int higher = arr.length;

        while (lower < higher) {
            int mid = (lower + higher) / 2;     // 중간위치를 구함

            /*
             *  key 값이 중간 위치의 값보다 작거나 같을 경우
             *
             *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
             */
            if (key <= arr[mid]) {
                higher = mid;
            } else {
                lower = mid + 1;
            }
        }
        return lower;
    }

    private static int upperBound(int[] arr, int key) {
        int lower = 0;
        int higher = arr.length;

        // lower가 higher랑 같아질 때까지 반복
        while (lower < higher) {
            int mid = (lower + higher) / 2;     // 중간위치 구함

            // key값이 중간 위치의 값보다 작을 경우
            if (key < arr[mid]) {
                higher = mid;
            } else {     // 중복원소의 경우 else에서 처리된다.
                lower = mid + 1;
            }
        }
        return lower;
    }
}
