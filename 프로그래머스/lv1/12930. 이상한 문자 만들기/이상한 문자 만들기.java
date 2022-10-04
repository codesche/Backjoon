class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                idx = 0;        // 인덱스 0 초기화
            } else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();      // 대문자로 변경
                idx++;
            } else if (idx % 2 != 0) {
                str[i] = str[i].toLowerCase();      // 소문자로 변경
                idx++;
            }
            answer += str[i];
        }
        return answer;
    }
}