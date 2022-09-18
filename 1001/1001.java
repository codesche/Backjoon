import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");           // 구분자
        int a = Integer.parseInt(st.nextToken());                     // 입력
        int b = Integer.parseInt(st.nextToken());                     // 입력

        System.out.println(a - b);
    }
}
