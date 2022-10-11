import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            ch[i] = Character.toLowerCase(ch[i]);
        }

        Arrays.sort(ch);

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                answer += ch[i];
            } else {
                answer += ch[i];
            }
        }

        return answer;
    }
}