class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for (int i = 3; i < sum; i++) {
            int j = sum / i;

            if (sum % i == 0 && j >= 3) {
                int height = Math.max(i, j);
                int width = Math.min(i, j);
                int center = (height - 2) * (width - 2);

                if (center == yellow) {
                    answer[0] = height;
                    answer[1] = width;
                    return answer;
                }
            }
        }
        return answer;
    }
}