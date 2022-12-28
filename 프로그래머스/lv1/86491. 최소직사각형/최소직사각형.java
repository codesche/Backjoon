class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_width = 0;                  // 가로
        int max_height = 0;                 // 세로

        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);

            max_width = Math.max(max_width, width);
            max_height = Math.max(max_height, height);

        }

        answer = max_width * max_height;

        return answer;
    }
}