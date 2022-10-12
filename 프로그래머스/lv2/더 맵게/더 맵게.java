
import java.util.PriorityQueue;

// 섞은 음식의 스코빌 지수 (mix_sum)
// = 가장 맵지 않은 음식의 스코빌 지수() + (두 번째로 맵지 않은 음식의 스코빌 지수(b))
public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;             // answer는 count 개념
        int mix_sum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 우선순위 큐에 배열 요소 추가
        for (int i = 0; i < scoville.length; i++) {
            pq.add((scoville[i]));
        }

        while (pq.peek() < K) {
            int f_spicy = pq.poll();

            // 꺼낸 이후 큐에 요소가 비어있거나 누적된 합이 K보다 여전히 작을경우
            if (mix_sum < K && pq.isEmpty()) {
                answer = -1;
                break;
            }

            int s_spicy = pq.poll();

            mix_sum = f_spicy + (s_spicy * 2);
            pq.add(mix_sum);
            answer++;

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 10, 12};

        Solution T = new Solution();
        System.out.println(T.solution(arr, 7));
    }
}
