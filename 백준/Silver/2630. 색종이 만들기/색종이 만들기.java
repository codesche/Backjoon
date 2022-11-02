import java.awt.print.Paper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int white = 0;
    static int blue = 0;
    static int[][] PaperBoard;

    public static void partition(int row, int col, int size) {
        if (check(row, col, size)) {
            if (PaperBoard[row][col] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        int new_size = size / 2;

        partition(row, col, new_size);
        partition(row, col + new_size, new_size);
        partition(row + new_size, col, new_size);
        partition(row + new_size, col + new_size, new_size);
    }

    // 해당 영역이 같은 색인지 검사
    public static boolean check(int row, int col, int size) {
        int value = PaperBoard[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (value != PaperBoard[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PaperBoard = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                PaperBoard[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);
        System.out.println(white);
        System.out.println(blue);

    }
}