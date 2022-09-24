import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
             int array_digit = Integer.parseInt(st.nextToken());
             array[i] = array_digit;
        }
        System.out.print(Arrays.stream(array).min().getAsInt() + " " + Arrays.stream(array).max().getAsInt());
    }
}
