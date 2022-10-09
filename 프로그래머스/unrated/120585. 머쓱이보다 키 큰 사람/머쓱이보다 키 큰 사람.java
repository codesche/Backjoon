class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        // 1. 배열 길이만큼 for문 돌림
        for (int i = 0; i < array.length; i++) {
            // 2. height와 배열 요소 비교하여 height보다 크면 카운트 증가
            if (height < array[i]) {
                answer++;
            }
        }
        
        return answer;
    }
}