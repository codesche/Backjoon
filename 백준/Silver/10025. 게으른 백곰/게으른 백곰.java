import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[1000001];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            
            arr[x] = g;
        }
        int window = 0;
        for (int i = 0; i < k+1 && i < arr.length; i++)  
            window += arr[i];
        
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int low = i - k -1;
            int high = i + k + 1;
            if(low >= 0)
                window -= arr[low];
            if(high < arr.length)
                window += arr[high];

            if(max < window)
                max = window;
        }
        bw.write(max+"\n");
        bw.flush();
    }
}