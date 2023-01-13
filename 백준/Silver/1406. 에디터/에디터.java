
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack stL = new Stack<>();
        Stack stR = new Stack<>();

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            stL.push(str.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.equals("L")) {
                if (!stL.empty()) {
                    stR.push(stL.pop());
                }
            } else if (input.equals("D")) {
                if (!stR.empty()) {
                    stL.push(stR.pop());
                }
            } else if (input.equals("B")) {
                if (!stL.empty()) {
                    stL.pop();
                }
            } else if (input.contains("P")) {
                char c = input.charAt(2);
                stL.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stL.empty()) {
            stR.push(stL.pop());
        }


        while (!stR.empty()) {
            sb.append(stR.pop());
        }

        System.out.print(sb);

    }

}
