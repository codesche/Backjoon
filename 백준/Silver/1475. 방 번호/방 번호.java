import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N = Integer.parseInt(br.readLine());

        int[] plastic = new int[9];

        int cnt = 0;

        // 일의 자리부터 N의 자리까지 탐색
        while (N != 0) {
            int temp = N % 10;

            if (temp == 9) {                // 9는 6과 동일
                temp = 6;
            }

            if (plastic[temp] == 0) {       // 현재 가지고 있는 플라스틱 숫자의 개수가 0이라면 새로 구입
                buySet(plastic);
                plastic[temp]--;
                cnt++;
            } else {
                plastic[temp]--;
            }

            N /= 10;
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();

    }

    static void buySet(int[] plastic) {
        for (int i = 0; i < 9; i++) {
            if (i == 6) {
                plastic[i] += 2;
            } else {
                plastic[i] += 1;
            }
        }
    }

}
