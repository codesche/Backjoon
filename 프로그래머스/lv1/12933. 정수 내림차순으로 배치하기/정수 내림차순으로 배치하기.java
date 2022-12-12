import java.util.*;

class Solution {
    public long solution(long n) {
        String temp = "";
        long answer = 0;

        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += ch[i];
        }

        answer = Long.parseLong(temp);

        return answer;
    }
}