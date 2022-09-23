import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int real_price = 0;

        int sum_price = Integer.parseInt(br.readLine());
        int thing_count = Integer.parseInt(br.readLine());

        for (int i = 0; i < thing_count; i++) {
            // 개행 구분 가능한 String 배열 생성
            String[] buffer = br.readLine().split(" ");

            int price = Integer.parseInt(buffer[0]);
            int count = Integer.parseInt(buffer[1]);

            real_price += (price * count);
        }

        if (sum_price == real_price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
