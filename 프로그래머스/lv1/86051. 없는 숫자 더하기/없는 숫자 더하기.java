class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 45;
        int temp_sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            temp_sum += numbers[i];
        }
        
        answer = sum - temp_sum;
        
        return answer;
    }
}