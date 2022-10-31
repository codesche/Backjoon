import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String a : participant) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (String a : completion) {
            map.put(a, map.get(a) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        return null;
    }
}