class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        char[] ch = str.toCharArray();
        int sum = 0;
        
        for (int i = 0; i < ch.length; i++) {
            sum += ch[i] - '0';
        }
        
        if (x % sum == 0) {
            return answer;
        } else {
            return false;
        }
    }
}