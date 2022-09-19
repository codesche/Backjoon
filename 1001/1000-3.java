import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BufferedReader, StringTokenizer 활용
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();                // readline 사용시 main메소드에 throws IOException 없으면 에러발생
        StringTokenizer st = new StringTokenizer(str, " ");
        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        System.out.println(numA + numB);
    }
}
