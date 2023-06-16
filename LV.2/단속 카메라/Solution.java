import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        
        // 출발점 기준 오름차순 정렬
        Arrays.sort(routes, (int[] o1, int[] o2) -> o1[0] - o2[0]);

        int count = 0;
        int camera = routes[0][1];
        
        for (int i=1; i<routes.length; i++) {
            
            // 현재 범위가 이전 범위에 포함되는 경우
            // 아직 카메라는 설치 안함. 위치만 조정을 함.
            if (routes[i][1] < camera) { 
                camera = routes[i][1];
                continue;
            }
            
            // 현재 범위가 이전 범위를 넘어가는 경우
            // 카메라 위치 조정 
            // 이전 범위에 대해 카메라 설치
            if (routes[i][0] > camera) {
                camera = routes[i][1];
                count++;
            }

      			// 범위가 걸치는 경우엔 카메라 위치 안 바꿈.
        }
        
        // 현재 범위에 대한 카메라 설치 및 리턴
        return count + 1;
    }
}
