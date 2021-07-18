import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        String str = String.valueOf(n);
        
        List<Character> chars = new ArrayList();
        
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        
        for (int i = str.length() - 1; i >= 0; i--) {
            int temp = Character.getNumericValue(chars.get(i));
            list.add(temp);
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
