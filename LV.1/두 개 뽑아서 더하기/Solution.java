import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        
        ArrayList<Integer> list = new ArrayList<> ();
        int total;

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                total = numbers[i] + numbers[j];
                if(!list.contains(total)) {
                    list.add(total);
                }
            }
        }
        
        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
