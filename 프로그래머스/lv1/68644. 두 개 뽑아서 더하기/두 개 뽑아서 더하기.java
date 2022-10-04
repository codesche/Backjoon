import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public static ArrayList<Integer> solution(int[] numbers) {
       HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}