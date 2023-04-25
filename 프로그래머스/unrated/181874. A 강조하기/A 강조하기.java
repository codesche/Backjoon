class Solution {
    public String solution(String myString) {
        String answer = "";
        String temp = "";

        temp = myString.replace("a", "A");

        char[] ch = temp.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i]) && ch[i] != 'A') {
                answer += Character.toLowerCase(ch[i]);
            }  else {
                answer += ch[i];
            }
        }

        return answer;
    }
}