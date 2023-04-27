import java.util.ArrayList;
import java.util.Objects;

class Solution {
    public ArrayList<String> solution(String my_string) {
        if (my_string.contains(" ")) {
            my_string = my_string.replace(" ", "#");
        }

        String[] tempArr = my_string.split("#");

        ArrayList list = new ArrayList();

        for (int i = 0; i < tempArr.length; i++) {
            if (Objects.equals(tempArr[i], "")) {
                continue;
            } else {
                list.add(tempArr[i]);
            }
        }

        return list;
    }
}