import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자 개수, 질의 개수 작성
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        // 인덱스가 1부터 시작하므로 배열 길이에 1 더함
        int[] S = new int[N + 1];
        
        StringTokenizer str = new StringTokenizer(br.readLine());

        // 숫자개수만큼 작성
        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(str.nextToken());
        }

        // 질의개수만큼 반복하여 작성
        for (int i = 0; i < M; i++) {
            StringTokenizer str2 = new StringTokenizer(br.readLine());
            int ii = Integer.parseInt(str2.nextToken());
            int jj = Integer.parseInt(str2.nextToken());
            System.out.println(S[jj] - S[ii - 1]);
        }
    }
}
