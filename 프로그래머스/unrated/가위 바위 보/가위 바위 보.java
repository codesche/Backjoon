class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        char[] ch = rsp.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case '2':
                    answer += '0';
                    break;
                case '0':
                    answer += '5';
                    break;
                case '5':
                    answer += '2';
                    break;
            }
        }
        
        return answer;
    }
}
