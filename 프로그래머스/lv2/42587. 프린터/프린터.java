import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (int p : priorities) {
            queue.add(p);
        }

        // 프린트 내역 배열 정렬
        Arrays.sort(priorities);
        int size = priorities.length - 1;

        int answer = 0;
        while (!queue.isEmpty()) {
            int i = queue.poll();
            location--;

            if (i == priorities[size - answer]) {
                answer++;

                if (location < 0) {
                    break;
                }
            } else {
                queue.add(i);

                if (location < 0) {
                    location = queue.size() - 1;
                }
            }

        }

        return answer;
    }
}