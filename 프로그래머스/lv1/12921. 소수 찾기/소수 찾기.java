class Solution {
    public int solution(int n) {
        int answer = 0;

        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        // 제곱근 구하기
        int root = (int)Math.sqrt(n);
        for (int i = 2; i <= root; i++) {               // 2 ~ 루트n까지 검사
            if (prime[i] == true) {                     // i번째의 수가 소수일 때
                for (int j = i; i * j <= n; j++) {      // 그 배수들을 다 false로 초기화
                    prime[i * j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                answer++;
            }
        }

        return answer;
    }
}