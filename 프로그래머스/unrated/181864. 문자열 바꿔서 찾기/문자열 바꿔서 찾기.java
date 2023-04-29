class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                temp.append('B');
            } else if (myString.charAt(i) == 'B') {
                temp.append('A');
            }
        }

        if (temp.toString().contains(pat)) {
            answer = 1;
        } 

        return answer;
    }
}