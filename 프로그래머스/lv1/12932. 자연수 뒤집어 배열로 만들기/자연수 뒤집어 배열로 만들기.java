class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            answer[s.length() - i - 1] = s.charAt(i) - '0';
        }

        return answer;
    }
}