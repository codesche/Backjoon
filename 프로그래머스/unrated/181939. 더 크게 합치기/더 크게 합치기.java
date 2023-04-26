class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String normal = String.valueOf(a) + String.valueOf(b);
        String reverse = String.valueOf(b) + String.valueOf(a);
        
        int normal_value = Integer.parseInt(normal);
        int reverse_value = Integer.parseInt(reverse);
        
        if (normal_value > reverse_value) {
            answer = normal_value;
        } else {
            answer = reverse_value;
        }
        
        return answer;
    }
}