import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // st에 공백을 기준으로 나눈 토큰들을 저장
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // countTokens()는 토큰의 개수를 반환
        System.out.println(st.countTokens());
    }
}
