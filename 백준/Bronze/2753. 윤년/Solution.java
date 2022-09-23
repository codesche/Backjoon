import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int leapyear = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        leapyear = Integer.parseInt(str.nextToken());

        if (leapyear % 4 == 0 & leapyear % 100 != 0) {
            System.out.println("1");
        } else if (leapyear % 400 == 0) {
            System.out.println("1");
        } else if (leapyear % 100 == 0 & leapyear % 100 != 0) {
            System.out.println("0");
        } else {
            System.out.println("0");
        }
    }
}
