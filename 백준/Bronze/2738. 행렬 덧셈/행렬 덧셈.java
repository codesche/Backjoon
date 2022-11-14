import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] C = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st3.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int[] array : C) {
            for (int arr : array) {
                System.out.print(arr + " ");
            }
            System.out.println();
        }
    }
}
