
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        
        int avg = 0;
        int sum = 0;
        int mid = 0;
        
        for (int i = 0; i < 5; i++) {
            sum += arr[i];

            if (i == 2) {
                mid = arr[i];
            }
        }

        avg = sum / 5;

        System.out.println(avg);
        System.out.println(mid);

    }

}
