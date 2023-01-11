import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int tar = str.indexOf(" ");
            int res = Integer.parseInt(str.substring(0,tar)) + Integer.parseInt(str.substring(tar + 1)); 
            sb.append(res + "\n");
        }
        br.close();
        System.out.print(sb);
    }
}