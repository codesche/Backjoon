import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Jewel {
        int weight;         // 보석 무게
        int price;          // 보석 가격

        // 생성자
        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 칸 띄운 공백 기준으로 두 수 입력시 사용하는 로직
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 보석 개수 입력
        int N = Integer.parseInt(st.nextToken());

        // 가방 개수 입력
        int K = Integer.parseInt(st.nextToken());

        // 보석 배열 선언 및 초기화
        Jewel[] jewel = new Jewel[N];

        // 가방 배열 선언 및 초기화
        int[] bags = new int[K];

        // 보석 무게
        int W = 0;

        // 보석 가격
        int P = 0;

        // 보석 배열 생성
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            // 보석 무게, 가격 입력
            W = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());

            jewel[i] = new Jewel(W, P);
        }

        // 가방 배열 생성
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        // 가방 배열 오름차순 정렬
        Arrays.sort(bags);

        // 보석 무게순으로 정렬 (오름차순)
        Arrays.sort(jewel, (g1, g2) -> Integer.compare(g1.weight, g2.weight));

        // 보석 가격이 높은 값을 기준으로 한 우선순위 큐 생성
        PriorityQueue<Jewel> pq = new PriorityQueue<>((g1, g2) -> Integer.compare(g2.price, g1.price));

        int gIndex = 0;
        long answer = 0;

        // 남은 가방 중 제일 작은 가방 선택
        for (int i = 0; i < K; i++) {
            // 선택된 가방에 넣을 수 있는 남은 보석 가운데 가장 비싼 보석을 선택 (1가방, 1보석)
            // N보다 작고, jewel[gIndex]가 가방의 무게보다 작은 조건의 보석들을 우선순위 큐(pq)에 넣어줌
            while (gIndex < N && jewel[gIndex].weight <= bags[i]) {
                pq.add(jewel[gIndex++]);
            }

            // pq에 비어있지 않다면 answer에 보석 가격을 더해줌
            if (!pq.isEmpty()) {
                answer += pq.poll().price;
            }
        }
        System.out.println(answer);
    }
}
