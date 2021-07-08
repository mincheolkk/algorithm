import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i=0; i < str.length; i++) {
            int j = Integer.parseInt(str[i]);
            list.add(j);
        }
         
        String min = Integer.toString(Collections.min(list));
        String max = Integer.toString(Collections.max(list));
        
        return min + " " + max;
    }
}
