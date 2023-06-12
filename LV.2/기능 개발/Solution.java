import java.util.*;

class Solution {
    public static int totalDay(int progress, int speed){
        return (int) Math.ceil((double) (100-progress)/speed);
    }
    
    public static List<Integer> solution(int[] progresses, int[] speeds) {

    List<Integer> answer = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>();
    
    for (int i=0; i<progresses.length; i++) {
        int day = totalDay(progresses[i], speeds[i]);
        q.add(day);
    }

    while (q.size()>0) {
        int count = 1;
        int left = q.poll();
        
        while(!q.isEmpty() && left >= q.peek()){
            count++;
            q.poll();
        }
        answer.add(count);
    }
    
    return answer;
  }
}
