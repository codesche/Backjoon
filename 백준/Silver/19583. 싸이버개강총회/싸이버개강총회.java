import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp[] = br.readLine().split(" ");
        String s = temp[0];
        String e = temp[1];
        String q = temp[2];
        String input;

        HashSet<String> set = new HashSet<>();
        HashSet<String> result = new HashSet<>();

        int cnt = 0;
        while ((input = br.readLine()) != null) {
            temp = input.split(" ");
            if (s.compareTo(temp[0]) >= 0) {
                set.add(temp[1]);
            } else if (q.compareTo(temp[0]) >= 0 && e.compareTo(temp[0]) <= 0) {
                result.add(temp[1]);
            }
        }

        for (String str : set) {
            if (result.contains(str)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
