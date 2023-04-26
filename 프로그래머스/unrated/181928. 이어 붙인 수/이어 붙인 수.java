class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenString = "";
        String oddString = "";
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenString += String.valueOf(num_list[i]);
            } else {
                oddString += String.valueOf(num_list[i]);
            }
        }
        
        int evenInteger = Integer.parseInt(evenString);
        int oddInteger = Integer.parseInt(oddString); 
        
        answer = evenInteger + oddInteger;
        
        return answer;
    }
}