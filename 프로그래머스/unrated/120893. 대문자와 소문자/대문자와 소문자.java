class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 97 && ch[i] <= 122) {
                ch[i] = Character.toUpperCase(ch[i]);
            } else if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = Character.toLowerCase(ch[i]);
            }
            answer += ch[i];
        }

        return answer;
    }
}