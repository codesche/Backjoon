import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int sum = A * B * C;

        char[] ch = String.valueOf(sum).toCharArray();

        int[] arr = new int[10];
        int[] digit = new int[10];

        for (int i = 0; i < 10; i++) {
            digit[i] = i;
        }

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (ch[i] - 48 == digit[j]) {
                    arr[ch[i] - 48] += 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
