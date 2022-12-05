import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] S = str.split("");             // 문자 하나하나 String 배열에 담는다
        String[] sum = S;                             // 1번과 똑같은 배열을 만든 후, 1번의 것들을 순차적으로 더하여 접미사를 생성
        for (int i = 0; i < S.length; i++) {
            for (int j = i + 1; j < S.length; j++) {
                sum[i] += S[j];
            }
        }
        
        // 사전순 배열 정렬 후 출력
        Arrays.sort(sum);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}