import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (a > b) {
            System.out.println(a - b - 1);
            
            for (long l = b + 1; l < a; l++) {
                System.out.print(l + " ");
            }
        }
        
        if (b > a) {
            System.out.println(b - a - 1);
            
            for (long l = a + 1; l < b; l++) {
                System.out.print(l + " ");
            }
            
        }
        
        if (a == b) {
            System.out.println(0);
        }

    }

}
