import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int sum1 = 0;
                    int sum2 = 0;
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) >= '0' && o1.charAt(i) <= '9') {
                            sum1 += Integer.parseInt(String.valueOf(o1.charAt(i)));
                        }
                    }

                    for (int i = 0; i < o2.length(); i++) {
                        if (o2.charAt(i) >= '0' && o2.charAt(i) <= '9') {
                            sum2 += Integer.parseInt(String.valueOf(o2.charAt(i)));
                        }
                    }
                    if (sum1 == sum2) {
                        return o1.compareTo(o2);
                    } else {
                        return sum1 - sum2;
                    }
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}

