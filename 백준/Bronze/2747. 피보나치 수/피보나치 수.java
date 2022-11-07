import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] D;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        D = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            D[i] = -1;
        }
        D[0] = 0;
        D[1] = 1;
        fibo(N);
        System.out.println(D[N]);
    }
    
    static int fibo(int n) {
        if (D[n] != -1) {               // 기존에 계산한 적이 있는 부분의 문제는 재계산하지 않고 리턴
            return D[n];
        }
        return D[n] = fibo(n - 2) + fibo(n - 1);
        // 메모이제이션 : 구한 값을 바로 리턴하지 않고 DP테이블에 저장한 후 리턴하도록 로직을 구현
    }
}