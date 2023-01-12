
// 여학생 : 0      남학생 : 1
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] room = new int[2][7];
        int count = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            room[S][Y]++;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                count += room[i][j] / K;
                if (room[i][j] % K != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
