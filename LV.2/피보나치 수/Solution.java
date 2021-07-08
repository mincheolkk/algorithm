class Solution {
    public int solution(int n) {
        int answer = 1;
        int final_minus_one = 1;
        int final_minus_two = 0;
        
        for (int i = 2; i < n+1; i++) {
            answer = (final_minus_one + final_minus_two) % 1234567;
            final_minus_two = final_minus_one % 1234567;
            final_minus_one = answer;
        }
        
        return answer;
    }
}
