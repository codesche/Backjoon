class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        char ch[] = s.toCharArray();
        
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (int i = 0; i < ch.length; i++) {
            if (Character.isAlphabetic(ch[i])) {
                return false;
            } 
        }
        return answer;
    }
}