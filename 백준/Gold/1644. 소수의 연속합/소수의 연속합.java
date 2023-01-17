import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static ArrayList<Integer> primelist = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        getPrime(N);

        int left = 0;
        int right = 0;
        int answer = 0;
        int sum = 2;
        int size = primelist.size();

        while (left < size && right < size) {
            if (sum == N) {
                answer++;
                sum -= primelist.get(left);
                left++;
            } else if (sum > N) {
                sum -= primelist.get(left);
                left++;
            } else {
                right++;
                if (right >= size) {
                    break;
                }
                sum += primelist.get(right);
            }
        }
        System.out.println(answer);

    }

    static void getPrime(int N) {
        int[] temp = new int[N + 1];
        int rootN = (int)Math.sqrt(N);

        for (int i = 2; i <= N; i++) {
            temp[i] = i;
        }

        for (int i = 2; i <= rootN; i++) {
            if (temp[i] != 0) {
                for (int j = i + i; j <= N; j += i) {
                    temp[j] = 0;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (temp[i] != 0) {
                primelist.add(temp[i]);
            }
        }
    }

}
