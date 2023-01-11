import java.io.*;
import java.util.*;

public class Main {
        static ArrayList<Integer> cards = new ArrayList();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i < 21; i++) {
            cards.add(i);
        }

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            reverse(a, b);
        }

        for (int i : cards) {
            System.out.print(i + " ");
        }
    }

    static void reverse(int start, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            temp.add(cards.remove(start - 1));
        }

        for (int i : temp) {
            cards.add(start - 1, i);
        }

    }
}
