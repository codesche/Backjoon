class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result = 0;

        for (int i = 0; i < num_list.length; i++) {
            result = num_list[i];

            while (true) {
                if (result % 2 == 0) {
                    result = result / 2;
                    answer++;
                } else if (result == 1){
                    break;
                } else if (result % 2 != 0){
                    result = (result - 1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}