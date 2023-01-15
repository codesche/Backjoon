
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println(recursion(A, B, C));

    }

    static long recursion(int A, int B, int C) {

        if (B == 0) {
            return 1;
        }

        long N = recursion(A, B / 2, C);

        if (B % 2 == 0) {
            return N * N % C;
        } else {
            return (N * N % C) * A % C;
        }

    }


}
