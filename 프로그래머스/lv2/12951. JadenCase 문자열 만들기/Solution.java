
// 
public class Main {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;
        
        for (String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

//        System.out.println(T.solution("3people unFollowed me"));
        System.out.println(T.solution("for the last week"));

    }
}
