
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] words1 = br.readLine().toCharArray();
        char[] words2 = br.readLine().toCharArray();

        int[] alpha = new int[26];

        for (char c : words1) {
            alpha[c - 97]++;
        }

        for (char c : words2) {
            alpha[c - 97]--;
        }

        int sum = 0;
        for (int i = 0; i < alpha.length; i++) {
            sum += Math.abs(alpha[i]);
        }
        System.out.println(sum);
    }
}
