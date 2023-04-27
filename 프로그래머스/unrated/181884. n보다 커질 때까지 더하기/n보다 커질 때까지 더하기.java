class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int idx = 0; idx < numbers.length; idx++) {
            answer += numbers[idx];
            
            if (answer > n) {
                break;
            } else {
                continue;
            }
        }
        
        return answer;
    }
}