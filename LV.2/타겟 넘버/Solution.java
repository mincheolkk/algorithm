class Solution {
    
    int[] numbers;
    int target;
    int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.target = target;
        this.numbers = numbers;
        
        dfs(0,0);
        
        return answer;
    }
    
    // 재귀로 반복 dfs
    // 이번 dfs 콜에서 연산할 숫자가 위치한 index
    // index 전까지의 계산을 sum
    void dfs (int index, int sum) {
        // 1. 재귀니까 탈출 조건 필요
        if (index == numbers.length) {
            if (sum == target) answer++;
            return;
        }
        
        // 2. 수행 동작
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]); 
    }
}
