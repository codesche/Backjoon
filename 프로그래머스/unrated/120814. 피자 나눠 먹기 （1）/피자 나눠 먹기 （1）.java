class Solution {
    public int solution(int n) {
        int answer = 0;

        if (n == 1) {
            answer = 1;
        }
        else if (n % 7 == 0) {
            answer = n / 7;
        } else if (n % 7 != 0) {
            answer = (n / 7) + 1;
        }


        return answer;
    }
}