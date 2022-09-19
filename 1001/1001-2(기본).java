import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();

        System.out.println(numA - numB);
        sc.close();
    }
}
