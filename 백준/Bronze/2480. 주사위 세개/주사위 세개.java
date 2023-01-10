import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 세 수가 다 다른 경우
        if (a != b && b != c && a != c) {
            int max;
            // 만약 a > b 라면
            if (a > b) {
                // c > a > b 라면
                if (c > a) {
                    max = c;
                } else {            // a > (b, c)
                    max = a;
                }
            }

            else {
                // c > b > a
                if (c > b) {
                    max = c;
                } else {            // b > (a, c)
                    max = b;
                }
            }
            System.out.println(max * 100);
        }

        // 적어도 한 쌍 이상의 서로 같은 변수가 존재한다면
        else {
            // 3개의 변수가 모두 같을 때
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            } else {
                // a가 b 또는 c와 같은 경우
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                } else {
                    System.out.println(1000 + b * 100);     // b와 c랑 같은 경우
                }
            }
        }
    }
}
