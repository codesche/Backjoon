class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(array[i]);
            char[] ch = s.toCharArray();

            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }
}
