class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int[] arr = new int[j - i + 1];

        for (int l = i, tmp = 0; l <= j; l++, tmp++) {
            if (tmp == arr.length) {
                break;
            }
            arr[tmp] = l;
        }

        for (int l = 0; l < arr.length; l++) {
            char[] ch = String.valueOf(arr[l]).toCharArray();

            for (int m = 0; m < ch.length; m++) {
                if (ch[m] - '0' == k) {
                    answer++;
                }
            }
        }

        return answer;
    }
}