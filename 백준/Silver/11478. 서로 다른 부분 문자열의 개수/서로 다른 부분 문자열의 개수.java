import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        HashSet<String> list = new HashSet<>();

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (!list.contains(str.substring(i, j))) {
                    list.add(str.substring(i, j));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(list.size() + "\n");
        System.out.println(sb);
    }
}
