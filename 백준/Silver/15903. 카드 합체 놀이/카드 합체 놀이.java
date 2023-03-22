import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static long[] cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        cards = new long[n];

        for (int i = 0; i < n; i++) {
            cards[i] = Long.valueOf(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(cards);

        // m회 반복
        while (m --> 0) {
            // 카드 두 장 더하기
            long a = cards[0];
            long b = cards[1];
            long sum = a + b;

            // 대입
            cards[0] = sum;
            cards[1] = sum;

            // 카드 두장 정렬
            // 삽입 정렬로 인덱스 1부터 시작
            // 1 삽입 정렬 후 인덱스 0 시작
            setInsertionSort(1);
            setInsertionSort(0);
        }

        long result = 0;
        for (long card: cards) {
            result += card;
        }

        System.out.println(result);
    }

    private static void setInsertionSort(int startIndex) {
        for (int i = startIndex + 1; i < cards.length; i++) {
            long card = cards[i - 1];
            long nextCard = cards[i];
            if (card <= nextCard) {
                break;
            }

            // swap
            cards[i - 1] = nextCard;
            cards[i] = card;
        }
    }
}
