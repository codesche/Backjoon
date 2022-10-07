class Solution {
    public int solution(int n) {
        int answer = 0;
        int digitnum = 0;

        String str = String.valueOf(n);

        while (n > 0) {
            digitnum = n % 10;
            answer += digitnum;
            n = n / 10;
        }

        return answer;
    }
}