class Solution {
    public int[] solution(String[] strlist) {
        // 1. 배열 길이 설정
        int[] answer = new int[strlist.length];
        String len = "";

        // 2. for 문 돌리면서 각 배열 요소들 길이 값 담은 배열 요소 정렬
        for (int i = 0; i < strlist.length; i++) {
            // 3. 배열 요소 길이만큼 for문 돌려서 길이 출력
            for (int j = 0; j < strlist[i].length(); j++) {
                    len += strlist[i].charAt(j);
            }

            answer[i] = len.length();
            len = "";

        }
        
        return answer;
    }
}