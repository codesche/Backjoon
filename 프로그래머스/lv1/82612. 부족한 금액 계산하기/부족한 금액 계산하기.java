

public class Solution {
    public static long solution(long price, long money, long count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        if (money > sum) {
            answer = 0;
        } else if (sum > money) {
            answer = sum - money;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20,4 ));
    }
}
