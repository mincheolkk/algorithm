import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer> ();
        int number = -1;
        
        for(int i=0;i<arr.length;i++) {
            if (number != arr[i]){
                number = arr[i];
                list.add(number);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);

        }

        return answer;
    }
}
