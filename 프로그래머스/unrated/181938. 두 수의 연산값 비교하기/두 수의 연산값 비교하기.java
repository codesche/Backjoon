class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String temp = String.valueOf(a) + String.valueOf(b);
        int result = Integer.parseInt(temp); 
        int cal_result = 2 * a * b;
        
        if (result > cal_result) {
            answer = result;
        } else if (result < cal_result) {
            answer = cal_result;
        } else if (result == cal_result) {
            answer = result;   
        }
        
        return answer;
    }
}