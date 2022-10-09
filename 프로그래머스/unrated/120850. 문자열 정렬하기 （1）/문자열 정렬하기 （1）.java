import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String replace_str = my_string.replaceAll("[^0-9]", "");
        char[] ch_arr = replace_str.toCharArray();
        
        Arrays.sort(ch_arr);

        int[] answer = new int[ch_arr.length];
        for (int i = 0; i < ch_arr.length; i++) {
            answer[i] = ch_arr[i] - '0';
        }

        return answer;
    }
}