import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int nArr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine().trim());
        nArr = new int[N];
        int sum = 0;
        int max = 0;
        for(int i = 0; i < N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
            sum += nArr[i];
            max = Math.max(max, nArr[i]);
        }

        st = new StringTokenizer(br.readLine().trim());
        M = Integer.parseInt(st.nextToken());

        if(sum <= M) {
            // 모든 요청이 배정될 수 있다
            System.out.println(max);
        } else {
            // 모든 요청이 배정될 수 없다.
            int ans = 0;
            int min = 0;
            int mid = 0;
            while(true) {
                mid = (max + min) / 2;
                sum = 0;
                if(mid == min) {
                    break;
                }
                for(int i = 0; i < N; i++) {
                    sum += (mid < nArr[i]) ? mid : nArr[i];
                }
                if(sum <= M) {
                    ans = Math.max(mid, ans);
                    min = mid;
                } else {
                    max = mid;
                }
            }
            System.out.println(ans);
        }
    }
}
 