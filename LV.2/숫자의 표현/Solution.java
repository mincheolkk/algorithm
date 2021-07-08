class Solution {
    public int solution(int n) {
        int sum = 0;
        int count = 0;
        
        for (int k=1; k < n+1; k++) {
            sum += k;
            if (sum > n) {
                break;
            } 
            if ((n-sum-k)%k == 0) {
                count = count +1;
            } 
        }
        return count;
    }
}
