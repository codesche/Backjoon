class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int left = 0;
        int right = pat.length();
        
        while (right != myString.length() + 1) {
            if (myString.substring(left, right).equals(pat)) {
                answer++;
                left++;
                right++;
            } else {
                left++;
                right++;
            }
        }
        
        return answer;
    }
}