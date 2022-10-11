class Solution {
    public int solution(String my_string) {
        int answer = 0;

        my_string = my_string.replaceAll("[^0-9]", "");

        char[] ch = my_string.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            answer += Character.getNumericValue(ch[i]);
        }

        return answer;
    }
}