class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        char ch[] = num_str.toCharArray();
        
        for (int i = 0; i < num_str.length(); i++) {
            answer += Character.getNumericValue(ch[i]);
        }
        
        return answer;
    }
}