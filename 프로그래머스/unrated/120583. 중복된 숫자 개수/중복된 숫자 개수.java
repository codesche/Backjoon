class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                cnt++;
            } else {
                continue;
            }
        }
        
        answer = cnt;
        
        return answer;
    }
}