

public class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);

        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] - '0' == (char)k) {
                answer = i + 1;
                break;
            } 
        }

        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        T.solution(29183, 1);
    }
}
