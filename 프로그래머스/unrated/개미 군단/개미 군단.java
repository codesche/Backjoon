class Solution {
    public int solution(int hp) {
        int answer = 0;
        int remain = hp - (hp - (hp % 5));

        if (hp % 5 == 0) {
            answer = hp / 5;
        } else if (hp % 5 != 0) {
            if (remain % 3 == 0) {
                remain = remain / 3;
            } else if (remain % 3 != 0) {
                remain = (remain % 3) +  (remain / 3);
            }
            answer = (hp / 5) + remain;
        }
        return answer;
    }
}
