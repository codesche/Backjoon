import java.util.Arrays;
import java.util.TreeSet;

class Solution {
    public int solution(int[] elements) {
        int[] arr = new int[elements.length + elements.length];

        System.arraycopy(elements, 0, arr, 0, elements.length);
        System.arraycopy(elements, 0, arr, elements.length, elements.length);

        TreeSet<Integer> tree = new TreeSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                tree.add(Arrays.stream(Arrays.copyOfRange(arr, j, j + i)).sum());
            }
        }

        return tree.size();
    }
}