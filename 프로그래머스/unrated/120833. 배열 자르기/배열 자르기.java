class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2 - num1) + 1];

        for (int i = 0; i < answer.length; i++) {
            for (int j = num1; j <= num2; j++) {
                answer[i] = numbers[j];
                num1++;
                break;
            }
        }

        return answer;
    }
}