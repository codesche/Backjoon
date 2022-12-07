import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10진법수 = N[0] * B^k + N[1] * B^k-1 + N[2] * B^k-2 ...
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            if ('0' <= n.charAt(i) && n.charAt(i) <= '9') {
                ans = ans * b + ((int)n.charAt(i) - (int)'0');
            } else {
                ans = ans * b + ((int)n.charAt(i) - (int)'A' + 10);
            }
        }
        System.out.println(ans);
    }
}