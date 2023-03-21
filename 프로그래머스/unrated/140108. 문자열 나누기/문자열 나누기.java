class Solution {
    public int solution(String s) {
        int answer = 1;
        int first = 1;
        int last = 0;
        int left = 0;
        int right = 1;

        while (right < s.length()) {
            if (first == last) {
                left = right;
                right += 1;
                first = 1;
                last = 0;
                answer++;
            } else {
                if (s.charAt(left) == s.charAt(right)) {
                    first++;
                } else {
                    last++;
                }
                right++;
            }
        }
        return answer;
    }
}