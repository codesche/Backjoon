class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ");
        int[] numbers = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }

            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        answer = min + " " + max;

        return answer;
    }
}