import java.util.HashMap;

class Solution {
    public int solution(String word) {
        int answer = 0;
        
        String vowel = "AEIOU";
        int[] multipleNumber = {781, 156, 31, 6, 1};
        
        for (int i=0; i < word.length(); i++) {
            answer += multipleNumber[i] * vowel.indexOf(word.charAt(i));
            answer += 1;
        }
        
        return answer;
    }
}
