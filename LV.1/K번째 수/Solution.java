import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] new_arr = {};
        int[] temp_arr = {};
        
        for (int i=0; i<commands.length; i++) {
            temp_arr = commands[i];
            
            new_arr = Arrays.copyOfRange(array,temp_arr[0]-1,temp_arr[1]);
            Arrays.sort(new_arr);
            
            answer[i] = new_arr[temp_arr[2]-1];
        }
        
        return answer;
    }
}
