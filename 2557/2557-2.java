import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//BufferedWriter 활용하여 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World!");
        bw.flush();
        bw.close();
    }
}
