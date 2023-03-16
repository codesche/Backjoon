import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
       HashMap<String, Integer> map = new HashMap<>();
       for (String player : participant) {
           map.put(player, map.getOrDefault(player, 0) + 1);
       }

       for (String player : completion) {
           map.put(player, map.get(player) - 1);
       }

       // HashMap에 있는 내부 요소 순회위해 Iterator 사용
       Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

       while (iter.hasNext()) {
           Map.Entry<String, Integer> entry = iter.next();
           if (entry.getValue() != 0) {
               answer = entry.getKey();
               break;
           }
       }

       return answer;
    }
}
