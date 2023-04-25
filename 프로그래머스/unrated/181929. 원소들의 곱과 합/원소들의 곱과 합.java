class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            multiply *= num_list[i];
        }
        
        sum = sum * sum;
        
        if (multiply < sum) {
            return 1;
        } else {
            return 0;
        }
        
    }
}