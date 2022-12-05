import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input;
        int[] count;

        while ((input = br.readLine()) != null) {
            count = new int[4];

            sb = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                int Ascii = input.charAt(i);

                // 소문자
                if (Ascii >= 97 && Ascii <= 122) {
                    count[0] += 1;
                }

                // 대문자
                if (Ascii >= 65 && Ascii <= 90) {
                    count[1] += 1;
                }

                // 숫자
                if (Ascii >= 48 && Ascii <= 57) {
                    count[2] += 1;
                }

                // 공백
                if (Ascii == 32) {
                    count[3] += 1;
                }
            }

            for (int ii : count) {
                sb.append(ii).append(" ");
            }

            System.out.println(sb);
        }
    }
}