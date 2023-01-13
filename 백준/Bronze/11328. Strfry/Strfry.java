
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Random random = new Random();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] inputArr = br.readLine().split(" ");
            String first = inputArr[0];
            String second = inputArr[1];

            int[] alphabet = new int[26];
            boolean isPossible = true;

            // 1. 배열에 알파벳 개수 세언 놓기
            for (int j = 0; j < first.length(); j++) {
                alphabet[(int)first.charAt(j) - 97] += 1;           // 증가
            }

            for (int j = 0; j < second.length(); j++) {
                alphabet[(int)second.charAt(j) - 97] -= 1;          // 감소
            }

            // 2. 배열 값 체크
            for (int item : alphabet) {
                if (item != 0) {        // 0인 경우 possible, 0 이상인 경우 impossible(못찾아서 남아있음)
                    isPossible = false;
                    break;
                }
            }

            bw.append(isPossible ? "Possible" : "Impossible");
            bw.append("\n");
        }
        bw.flush();
    }

}
