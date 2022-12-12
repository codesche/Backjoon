class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;

        if (n == 1) {
            return 0;
        }

        while (n != 1) {
            if (Math.abs(n) % 2 == 0) {
                n = Math.abs(n / 2);
            } else if (Math.abs(n) % 2 != 0) {
                n = (Math.abs(n * 3)) + 1;
            }

            answer++;

            if (answer > 500) {
                return -1;
            }
        }

        return answer;
    }
}