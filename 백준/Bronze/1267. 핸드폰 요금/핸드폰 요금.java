import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int MS = 0;
        int YS = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 지난달 통화 개수
        for (int i = 0; i < N; i++) {
            YS += ((arr[i] / 30) + 1) * 10;
            MS += ((arr[i] / 60) + 1) * 15;
        }

        if (YS == MS) {
            System.out.println("Y M " + YS);
        } else if (MS < YS) {
            System.out.println("M " + MS);
        } else if (YS < MS) {
            System.out.println("Y " + YS);
        }

    }
}