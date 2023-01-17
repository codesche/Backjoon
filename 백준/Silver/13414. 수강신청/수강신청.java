
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;

        // 순서대로 저장됨
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < k; i++) {
            String num = br.readLine();
            if (set.contains(num)) {            // 중복 제거
                set.remove(num);
            }
            set.add(num);
        }

        for (String x : set) {
            count++;
            System.out.println(x);
            if (count == n) {
                break;
            }
        }


    }

}
