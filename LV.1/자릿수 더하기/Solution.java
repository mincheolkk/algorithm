import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        
        int answer = 0;
        
        for (int i=0; i<str.length(); i++) {
            int j = Integer.parseInt(str.substring(i,i+1));
            answer += j;
        }
        return answer;
    }
}
