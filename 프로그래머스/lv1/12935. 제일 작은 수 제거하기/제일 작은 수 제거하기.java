import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int minValue = Integer.MAX_VALUE;
        int minIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

            if (minValue > arr[i]) {
                minValue = arr[i];
                minIdx = i;
            }

            if (i == arr.length - 1) {
                list.remove(minIdx);
            }
        }

        if (arr.length == 1) {
            list.add(-1);
            return list;
        } else {
            return list;
        }
    }
}