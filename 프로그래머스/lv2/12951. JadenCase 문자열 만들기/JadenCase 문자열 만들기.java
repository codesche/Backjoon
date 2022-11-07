

public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" "); // 공백을 기준으로 문자열 자르기

        // 공백을 기준으로 잘려진 문자열의 수만큼 반복
        for(int i = 0; i < str.length; i++){
            if (str[i].length() == 0)  {
                answer += " "; // 단어가 공백일 경우 반환값에 공백 더하기
            } else {
                answer += str[i].substring(0, 1).toUpperCase(); // 단어 첫번째 대문자로 변환하여 더하기
                answer += str[i].substring(1, str[i].length()).toLowerCase(); // 첫글자를 제외하고 소문자로 변환하여 더하기
                answer += " "; // 띄어쓰기
            }

        }

        //원래 문자열 마지막이 공백일 경우 그대로 answer 반환
        if (s.substring(s.length() -1, s.length()).equals(" ")) {
            return answer;
        }

        //마지막에 공백이 더해져서 그 공백을 제외한 answer값 반환
        return answer.substring(0, answer.length() - 1);
    }
}
