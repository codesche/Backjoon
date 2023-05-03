class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        char[] array = my_string.toCharArray();
        
        for (int i = 0; i < s; i++) {
            answer += array[i];
        }
        
        for (int i = e; i >= s; i--) {
            answer += array[i];
        }
        
        for (int i = e + 1; i < array.length; i++) {
            answer += array[i];
        }
        
        return answer;
    }
}