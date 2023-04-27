import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        answer = Arrays.stream(strArr)
                    .filter(item -> !item.contains("ad"))
                    .toArray(String[]::new);
        
        return answer;
    }
}