import java.util.*;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        // i번째 숫자부터 j번째 숫자까지 자르고 정렬 후 k번째에 있는 수를 구한다
        // [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
        answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<Integer>();

            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }

            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1);
        }

        return answer;
    }
}