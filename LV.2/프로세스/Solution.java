import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            q.add(priorities[i]);
        }
    
        while(!q.isEmpty()) {
            int max = 0;
            for (int i : q) {
                if (i > max) max = i;
            }

            if (q.peek() >= max) {
                answer++;
                
                if (location == 0) break;
                else q.poll(); location--;
                
            } else {
                q.offer(q.poll());
                
                if (location == 0) {
                    location = q.size() -1 ;
                } else location--;   
            }
        }
        
        return answer;
    }
}
