import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        // 숫자입력시 기존 String형에서 int형으로 변환
        int numA = Integer.parseInt(str[0]);
        int numB = Integer.parseInt(str[1]);

        System.out.println(numA - numB);
    }
}
