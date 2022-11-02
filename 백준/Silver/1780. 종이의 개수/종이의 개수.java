import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int paper1 = 0;          // -1에 해당
    static int paper2 = 0;          // 0에 해당
    static int paper3 = 0;          // 1에 해당
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);
        System.out.println(paper1);
        System.out.println(paper2);
        System.out.println(paper3);

    }

    public static void partition(int row, int col, int size) {
        if (check(row, col, size)) {
            if (board[row][col] == -1) {
                paper1++;
            } else if (board[row][col] == 0) {
                paper2++;
            } else {
                paper3++;
            }
            return;
        }
        
        // 분할
        int newSize = size / 3;

        // Top
        partition(row, col, newSize);                                           // 왼쪽 위
        partition(row, col + newSize, newSize);                                 // 중앙 위
        partition(row, col + newSize * 2, newSize);                             // 오른쪽 위

        // Mid
        partition(row + newSize, col, newSize);                                 // 왼쪽 중간
        partition(row + newSize, col + newSize, newSize);                       // 중앙 중간
        partition(row + newSize, col + newSize * 2, newSize);                   // 오른쪽 중간

        // Bottom
        partition(row + newSize * 2, col, newSize);                             // 왼쪽 아래
        partition(row + newSize * 2, col + newSize, newSize);                   // 중앙 아래
        partition(row + newSize * 2, col + newSize * 2, newSize);               // 오른쪽 아래
    }

    // 해당 영역이 같은 색인지 검사하는 메소드
    public static boolean check(int row, int col, int size) {
        int num = board[row][col];

        for (int i = row; i < row + size; i++) {
             for (int j = col; j < col + size; j++) {
                if (num != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}