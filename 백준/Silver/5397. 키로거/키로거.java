
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] input;

        for (int i = 0; i < N; i++) {
            Stack stL = new Stack<>();
            Stack stR = new Stack<>();
            input = br.readLine().split("");

            for (String str : input) {
                switch (str) {
                    case "<":
                        if (!stL.isEmpty()) {
                            stR.push(stL.pop());
                        }
                        break;

                    case ">":
                        if (!stR.isEmpty()) {
                            stL.push(stR.pop());
                        }
                        break;

                    case "-":
                        if (!stL.isEmpty()) {
                            stL.pop();
                        }
                        break;

                    default:
                        stL.push(str);
                }
            }


            while (!stL.empty()) {
                stR.push(stL.pop());
            }

            while (!stR.empty()) {
                sb.append(stR.pop());
            }
            sb.append("\n");
        }

        System.out.print(sb);

    }

}
