import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String t1 = br.readLine();
        String[] numbers = t1.split(" ");

        long num1 = Long.parseLong(numbers[0]);
        long num2 = Long.parseLong(numbers[1]);

        long gcd = gcd(Math.max(num1, num2), Math.min(num1, num2));

        for (int i = 1; i <= gcd; i++) {
            sb.append("1");
        }

        System.out.println(sb.toString());
    }

    public static long gcd(long a, long b) {
        while (b > 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}