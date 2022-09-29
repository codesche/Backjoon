import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] stArr = String.valueOf(n).split("");
        Arrays.sort(stArr);
        
        StringBuilder sb = new StringBuilder();
        for (int i = stArr.length - 1; i >= 0; i--) {
            sb.append(stArr[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}