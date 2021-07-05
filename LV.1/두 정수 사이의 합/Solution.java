import java.util.ArrayList;
import java.util.List;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        List<Integer> intTemp = new ArrayList<Integer> ();
        intTemp.add(a);
        intTemp.add(b);
        
        intTemp.sort(null);
        for(int i=intTemp.get(0); i<=intTemp.get(1); i++) {
            answer+=i;
        }
        return answer; 
    }
}
