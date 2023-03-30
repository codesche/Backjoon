import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> teamMap = new HashMap<>();

        String[] temp = br.readLine().split(" ");
        int teamCnt = Integer.parseInt(temp[0]);
        int questionCnt = Integer.parseInt(temp[1]);

        for (int i = 0; i < teamCnt; i++) {
            String teamName = br.readLine();

            StringBuilder sb = new StringBuilder();
            int memCnt = Integer.parseInt(br.readLine());
            String[] memberList = new String[memCnt];
            for (int j = 0; j < memCnt; j++) {
                memberList[j] = br.readLine();
            }
            Arrays.sort(memberList);
            for (int j = 0; j < memCnt; j++) {
                sb.append(memberList[j]);
                if (j != memCnt - 1) {
                    sb.append("|");
                }
            }
            teamMap.put(teamName, sb.toString());
        }

        for (int i = 0; i < questionCnt; i++) {
            String questionName = br.readLine();
            int questionType = Integer.parseInt(br.readLine());

            // Team
            if (questionType == 0) {
                String str = teamMap.get(questionName);
                String[] res = str.split("\\|");

                for (String re : res) {
                    bw.append(re).append("\n");
                }
            } else if (questionType == 1) {
                // Member
                for (String teamName : teamMap.keySet()) {
                    String memberFullString = teamMap.get(teamName);
                    if (memberFullString.contains(questionName)) {
                        bw.append(teamName).append("\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
    }
}
