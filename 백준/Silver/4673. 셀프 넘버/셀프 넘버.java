public class Main {

    public static void main(String[] args) {        // 메인

        boolean[] check = new boolean[10001];       // 1 ~ 10000

        for (int i = 1; i < 10001 ; i++) {
            int n = func(i);

            if (n < 10001) {                        // 10000이 넘는 수는 필요가 없음
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        // self 넘버 출력
        for (int i = 1; i < 10001; i++) {
            if  (!check[i]) {                   // false인 인덱스만 출력
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int func(int number) {              // 함수
        int sum = number;

        while (number != 0) {
            sum = sum + (number % 10);              // 첫째 자리수
            number = number / 10;                   // 10을 나누어 첫째 자리를 없앤다
        }
        return sum;
    }
}
