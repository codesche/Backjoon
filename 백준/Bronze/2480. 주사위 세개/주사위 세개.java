import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = 0;
        int dice_num = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b & a == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a == b || b == c || a == c) {
            if (a == b) {
                dice_num = a;
            } else if (b == c) {
                dice_num = b;
            } else if (a == c) {
                dice_num = c;
            }
            System.out.println(1000 + (dice_num * 100));
        } else if (a != b & b != c & a != c) {
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
            if (max > c) {
                System.out.println(max * 100);
            } else {
                System.out.println(c * 100);
            }
        }
    }
}