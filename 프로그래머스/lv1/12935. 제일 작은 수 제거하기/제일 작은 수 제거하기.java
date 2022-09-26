import java.util.ArrayList;
import java.util.List;

class Solution {
     public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};

        // 순서대로 탐색하며 가장 작은 수 찾기
        int min = Integer.MAX_VALUE;
        for(int a : arr) {
            if(min > a) min = a;
        }

        // 위에서 찾은 가장 작은 수를 제외하고 새로운 배열 만들기
        int[] newArr = new int[arr.length-1];
        int index = 0;
        for(int a : arr) {
            if(min != a) newArr[index++] = a;
        }

        return newArr;
    }
}