class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;
        
        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'p' || ch[i] == 'P') {
                p_cnt++;
            } else if (ch[i] == 'y' || ch[i] == 'Y') {
                y_cnt++;
            }
        }
        
        if (p_cnt == y_cnt) {
            return answer;
        } else {
            return false;
        }
    }
}