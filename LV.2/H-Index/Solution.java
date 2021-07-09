class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for (int i = 0; i < citations.length+1; i++) {
            int count = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i) {
                    count += 1;
                }
            }
            if (count >= i) {
                answer = i;
            }
        }
        return answer;
    }
}
