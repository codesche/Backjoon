import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nStr = br.readLine();
        int sum = 0;

        char[] charArr = nStr.toCharArray();
        Arrays.sort(charArr);
        int len = charArr.length;

        StringBuilder sb = new StringBuilder();
        // 오름차순 정렬
        for (int i = len - 1; i >= 0; i--) {
            int num = charArr[i] - '0';
            sum += num;
            sb.append(num);
        }

        // 30의 배수인지 판단하기 위한 조건 생성
        if (charArr[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sb.toString());
    }
}
