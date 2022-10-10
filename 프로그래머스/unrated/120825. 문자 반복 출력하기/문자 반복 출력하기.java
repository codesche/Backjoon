class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String tmp = "";

        for (int i = 0; i < my_string.length(); i++) {
            tmp = my_string.substring(i);
            for (int j = 0; j < n; j++) {
                answer += tmp.substring(0, 1);
            }
        }

        return answer;
    }
}