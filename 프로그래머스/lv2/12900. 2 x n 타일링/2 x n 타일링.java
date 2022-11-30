class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int dp[] = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = 1;
            } else if (i == 2) {
                dp[i] = 2;
            } else {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000007;
            }
        }
        answer = dp[n];
        
        return answer;
    }
}