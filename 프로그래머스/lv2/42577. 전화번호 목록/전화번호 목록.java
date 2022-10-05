import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, String> hashmap = new HashMap<>();

        for (String str : phone_book) {
            hashmap.put(str, str);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (hashmap.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}