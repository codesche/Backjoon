import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            long answer = Lcm(a, b);
            System.out.println(answer);
        }
    }

    private static long Lcm(int a, int b) {
        long big, small;

        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        long gcd = Gcd(big, small);
        long lcm = (big * small) / gcd;

        return lcm;
    }
    
    // 재귀함수 이용
    private static long Gcd(long big, long small) {
        if (big % small == 0) {
            return small;
        }

        return Gcd(small, big % small);
    }

}
