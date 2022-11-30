import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());       // 월
        int day = Integer.parseInt(st.nextToken());       // 일

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for (int i = 1; i <= 12; i++) {
            if (i == month) {
                break;
            }
            sum += months[i];
        }
        sum += day;
        
        // month와 day를 더한 값을 7로 나눈 나머지의 값을 가지고 요일을 출력
        int left = sum % 7;

        switch(left) {
            case 0 :
                System.out.println("SUN");
                break;
            case 1 :
                System.out.println("MON");
                break;
            case 2 :
                System.out.println("TUE");
                break;
            case 3 :
                System.out.println("WED");
                break;
            case 4 :
                System.out.println("THU");
                break;
            case 5 :
                System.out.println("FRI");
                break;
            case 6 :
                System.out.println("SAT");
                break;
        }
    }
}