import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;        // 초기 상태 여부 확인 위한 값
        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");

        while (subtraction.hasMoreTokens()) {
            int tmp = 0;

            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");

            // 덧셈으로 나뉜 토큰들 모두 더하기
            while (addition.hasMoreTokens()) {
                tmp += Integer.parseInt(addition.nextToken());
            }

            // 첫 번째 토큰인 경우
            if (sum == Integer.MAX_VALUE) {
                sum = tmp;
            } else {
                sum -= tmp;
            }
        }
        System.out.println(sum);
    }
}
