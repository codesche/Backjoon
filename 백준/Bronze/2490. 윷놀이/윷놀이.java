import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 도 : 3 - A
    // 개 : 2 - B
    // 걸 : 1 - C
    // 윷 : 0 - D
    // 모 : 4 - E
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"D", "C", "B", "A", "E"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            sb.append(arr[sum] + "\n");
        }
        System.out.println(sb);
    }
}
