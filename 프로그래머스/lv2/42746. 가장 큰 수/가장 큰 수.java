import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        // 1. 입력 데이터를 문자열 배열로 반환
        String[] str = new String[numbers.length];

        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        // 2. Comparator 인터페이스로 정렬 기준을 설정
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // 3. 모든 문자열 연결
        for (String arr : str) {
            answer += arr;
        }

        // 4. 입력 데이터가 모두 0인 경우 예외 처리
        if (str[0].equals("0")) {
            answer = "0";
        }

        return answer;
    }
}