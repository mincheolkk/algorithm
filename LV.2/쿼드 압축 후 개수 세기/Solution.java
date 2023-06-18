class Solution {
    public int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        slice(arr, 0,0, arr.length);
        return answer;
    }
    
    public void slice(int[][] arr, int x, int y, int size) {
        if(size == 1){
            int num = arr[x][y];
            answer[num]++;
            return;
        }
        
        if(check(arr,x,y,size)){
            return;
        }
        
        int newSize = size/2;
        
        slice(arr,x,y,newSize); // 1사분면
        slice(arr,x,y+newSize,newSize); // 2사분면
        slice(arr,x+newSize,y,newSize); // 3사분면
        slice(arr,x+newSize,y+newSize,newSize); // 4사분면
    }
    
    public boolean check(int[][] arr, int x, int y, int size) {
        // 탐색 영역의 시작점 값 확인
        int num = arr[x][y];
        
		    // 주어진 범위 전체 탐색
        for(int i = x; i < x+size; i++){
            for(int j = y; j < y+size; j++){
                if(num != arr[i][j]){
                    // 시작점 값과 다르면 false
                    return false;
                }
            }
        }
        answer[num]++;
        return true;
    }
}
