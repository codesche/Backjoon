import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

       if (a > b) {
           System.out.print('>');
       } else if (a < b) {
           System.out.print('<');
       } else if (a == b) {
           System.out.print("==");
       }
    }
}

