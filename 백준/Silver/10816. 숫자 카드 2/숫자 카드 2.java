import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();

        // 숫자 카드 입력
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 처음 들어오는 숫자
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {        // 이미 있는 숫자라면  + 1
                map.put(num, map.get(num) + 1);
            }
        }

        // 찾을 카드 입력
        int M = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(str.nextToken());

            // 숫자가 존재하면 갯수 리턴
            if (map.containsKey(num)) {
                sb.append(map.get(num) + " ");
            } else {        // 없다면 0
                sb.append(0 + " ");
            }
        }
        System.out.print(sb.toString());
    }
}
