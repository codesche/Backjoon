import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
    Node[] next = new Node[26];         // 26개 알파벳 고려하여 노드 배열 선언
    boolean isEnd;                      // 문자열의 마지막 유무 표시
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받는 두 수를 공백 구분자로 구분하여 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Node root = new Node();                         // 규칙 : 루트 노드는 비어 있음

        while (N > 0) {
            String text = br.readLine();
            Node now = root;

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);

                // 26개의 알파벳의 위치를 배열 index로 나타내기 위해 - 'a' 수행
                if (now.next[c - 'a'] == null) {
                    now.next[c - 'a'] = new Node();
                }
                now = now.next[c - 'a'];
                if (i == text.length() - 1) {
                    now.isEnd = true;
                }
            }
            N--;
        }
        int count = 0;
        while (M > 0) {
            String text = br.readLine();
            Node now = root;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (now.next[c - 'a'] == null) {                    // 공백 노드라면 이 문자열을 포함하지 않음
                    break;
                }
                now = now.next[c - 'a'];
                if (i == text.length() - 1 && now.isEnd) {          // 문자열의 끝이고 현재까지 모두 일치하면
                    count++;                                        // S 집합에 포함되는 문자열
                }
            }
            M--;
        }
        System.out.println(count);
    }
}
