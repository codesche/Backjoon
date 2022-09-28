class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer(Integer.toBinaryString(arr1[i] | arr2[i]));

            for (int j = sb.length(); j < n; j++) {
                sb.insert(0, "0");
            }

            answer[i] = sb.toString();
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }
        return answer;
    }
}