import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> cards = new HashMap<>();

        int max = 0;
        long x = 0;
        for (int i = 0; i < N; i++) {
            long card = Long.parseLong(br.readLine());

            cards.put(card, cards.getOrDefault(card, 0) + 1);

            if (cards.get(card) > max) {
                max = cards.get(card);
                x = card;
            } else if (cards.get(card) == max) {
                x = Math.min(x, card);
            }
        }
        System.out.println(x);
    }
}