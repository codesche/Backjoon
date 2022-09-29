
public class TEST {
    boolean solution(String s) {
        boolean answer = false;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            }

            if (s.charAt(i) == ')') {
                count--;
            }

            if (count < 0) {
                break;
            }
        }

        if (count == 0) {           // 0이라는 건 쌍이 맞춰졌다는 뜻
            answer = true;
        }
        return answer;
    }
}

