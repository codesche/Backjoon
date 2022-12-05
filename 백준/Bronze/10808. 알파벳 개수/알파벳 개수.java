import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 97]++;         // 개수 1씩 늘려주기
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}