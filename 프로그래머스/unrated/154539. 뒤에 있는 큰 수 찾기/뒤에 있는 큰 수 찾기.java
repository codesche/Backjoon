import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int idx = 0; idx < numbers.length; idx++) {
            while (!stack.isEmpty() && numbers[idx] > numbers[stack.peek()]) {
                int stackIdx = stack.pop();
                answer[stackIdx] = numbers[idx];
            }
            stack.push(idx);
        }

        return answer;
    }
}