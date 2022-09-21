import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        sc.close();

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("??!");

        System.out.print(sb);
    }
}
