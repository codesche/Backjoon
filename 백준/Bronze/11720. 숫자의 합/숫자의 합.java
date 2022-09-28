import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        for (byte val : br.readLine().getBytes()) {
            sum += (val - '0');
        }

        System.out.print(sum);
    }
}