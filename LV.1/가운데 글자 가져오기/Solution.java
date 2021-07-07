class Solution {
    public String solution(String s) {
        int a = s.length();
        
        String answer = "";
        
        if (1 <= a && a <=100) {
            if (a % 2 == 0) {
                answer = s.substring(a/2-1,a/2+1);
            }
            else {
                answer = s.substring(a/2,a/2+1);
            }
        } return answer;
    }
}
