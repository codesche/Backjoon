import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String log = input[1];

            if (log.equals("enter")) {
                set.add(name);
            }
            
            if (log.equals("leave")) {
                if (set.contains(name)) {
                    set.remove(name);
                }
            }
        }

        List<String> list = new ArrayList<>();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            list.add(it.next());
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for (String name : list) {
            bw.write(name + "\n");
        }
        
        bw.flush();
    }
}
