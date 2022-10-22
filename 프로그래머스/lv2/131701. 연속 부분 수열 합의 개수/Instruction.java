import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
    public int solution(int[] elements) {
        int[] arr = new int[elements.length + elements.length];
        
        // System.arraycopy (src, srcPos, dest, destPos, length)
        // src : 복사하고자 하는 소스
        // srcPos : 위의 원본 소스에서 어느 부분부터 읽어올지 위치를 정해줌
        // dest : 복사할 소스
        // destPos : 위의 복사본에서 자료 받을 때, 어느 부분부터 쓸 것인지 시작 위치 정해줌
        // length : 원본에서 복사본까지 얼마만큼 읽어올지 입력
        System.arraycopy(elements, 0, arr, 0, elements.length);
        System.arraycopy(elements, 0, arr, elements.length, elements.length);

        // 오름차순
        TreeSet<Integer> tree = new TreeSet<>();

        // Arrays.copyOf(복사할 배열, 복사할 배열의 크기)
        // Arrays.copyOfRange(복사하고자하는 배열, 시작 위치, 배열크기)
        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                tree.add(Arrays.stream(Arrays.copyOfRange(arr, j, j + i)).sum());
            }
        }

        return tree.size();
    }
}
