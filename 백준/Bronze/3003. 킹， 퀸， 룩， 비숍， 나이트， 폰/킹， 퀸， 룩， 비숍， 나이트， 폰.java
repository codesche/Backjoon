import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] chess_arr = {1, 1, 2, 2, 2, 8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int require_king = chess_arr[0] - Integer.parseInt(st.nextToken());
        int require_queen = chess_arr[1] - Integer.parseInt(st.nextToken());
        int require_look = chess_arr[2] - Integer.parseInt(st.nextToken());
        int require_bishop = chess_arr[3] - Integer.parseInt(st.nextToken());
        int require_knight= chess_arr[4] - Integer.parseInt(st.nextToken());
        int require_pone = chess_arr[5] - Integer.parseInt(st.nextToken());

        System.out.print(require_king + " ");
        System.out.print(require_queen + " ");
        System.out.print(require_look + " ");
        System.out.print(require_bishop + " ");
        System.out.print(require_knight + " ");
        System.out.print(require_pone + " ");
    }
}