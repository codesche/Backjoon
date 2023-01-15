import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.contains("push")) {
                String arr[] = str.split(" ");
                queue.offer(Integer.parseInt(arr[1]));
                last = Integer.parseInt(arr[1]);
            } else if (str.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(queue.poll() + "\n");
                }
            } else if (str.equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (str.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            } else if (str.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(queue.peek() + "\n");
                }
            } else if (str.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(last + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
