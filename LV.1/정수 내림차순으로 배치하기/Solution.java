import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] temp = str.split("");
        ArrayList<Long> list = new ArrayList<>();
        
        for (int i = 0; i < temp.length; i++) {
            list.add(Long.parseLong(temp[i]));
        }
        Collections.sort(list,Collections.reverseOrder());
        
        String ans = "";
        
        for (int i=0; i<list.size(); i++){
            ans += Long.toString(list.get(i));
        }
        long answer = Long.parseLong(ans);
        return answer;
    }
}
