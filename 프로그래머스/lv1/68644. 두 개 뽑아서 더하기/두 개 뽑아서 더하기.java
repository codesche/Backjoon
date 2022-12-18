import java.util.*;

class Solution {
    public ArrayList solution(int[] numbers) {
        ArrayList list = new ArrayList();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];

                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }
        
        Collections.sort(list);
        
        return list;
    }
}