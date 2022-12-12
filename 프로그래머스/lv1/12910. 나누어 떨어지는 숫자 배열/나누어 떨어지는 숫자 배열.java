import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        
        Collections.sort(list);

        if (list.isEmpty()) {
            list.add(-1);
        }

        return list;
    }
}