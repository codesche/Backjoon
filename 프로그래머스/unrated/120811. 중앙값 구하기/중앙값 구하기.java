class Solution {
    public int solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    continue;
                }
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        if (array.length % 2 != 0) {
            return array[array.length / 2];
        }

        return (array[(array.length / 2) - 1] + array[array.length / 2]) / 2;
    }
}