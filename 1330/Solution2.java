import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        // 삼항 연산자를 활용한 풀이
        // a가 b보다 크면 ">"를 출력, 해당 조건 아니면 다시 삼항연산자 실행 후 조건에 맞게 출력
        System.out.println((a > b) ? ">" : ((a < b) ? "<" : "=="));
    }
}

