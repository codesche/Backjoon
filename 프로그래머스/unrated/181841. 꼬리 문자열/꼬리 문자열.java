class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for (int idx = 0; idx < str_list.length; idx++) {
            if (str_list[idx].contains(ex)) {
                continue;
            } else {
                answer += str_list[idx];
            }
        }
        return answer;
    }
}