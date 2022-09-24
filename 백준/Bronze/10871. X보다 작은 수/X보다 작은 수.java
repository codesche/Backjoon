import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        // 두 수 입력 받은 후 개행 입력 가능하도록 적용
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int Sequence_Number = Integer.parseInt(st.nextToken());

            if (Sequence_Number < X) {
                sb.append(Sequence_Number).append(' ');
            }
        }
        System.out.println(sb);
    }
}
