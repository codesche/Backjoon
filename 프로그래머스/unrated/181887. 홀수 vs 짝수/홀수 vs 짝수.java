class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i = 1; i < num_list.length + 1; i++) {
            if (i % 2 == 0) {
                evenSum += num_list[i - 1];
            } else {
                oddSum += num_list[i - 1];
            }
        }
        
        if (evenSum > oddSum) {
            answer = evenSum;
        } else if (evenSum < oddSum) {
            answer = oddSum;
        } else {
            answer = evenSum;
        }
        
        return answer;
    }
}