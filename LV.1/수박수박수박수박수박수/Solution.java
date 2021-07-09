import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        List<String> list = new ArrayList<String> ();
        
        for (int i=1; i < n+1; i++) {
            if (i % 2 == 1) {
                list.add("수");
            } else {
                list.add("박");
            }
        }
        
        for (int i=0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}
