import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 한 칸 띄고
        int C = Integer.parseInt(br.readLine());

        int min = 60 * A + B;       // 시 -> 분
        min += C;

        int hour = (min / 60) % 24;
        int result_min = min % 60;

        System.out.println(hour + " " + result_min);
    }
}
