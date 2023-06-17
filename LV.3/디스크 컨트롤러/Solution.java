import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        // 요청 시점 기준 오름차순, 같다면 처리시간 기준 오름차순
        Arrays.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                if(a1[0] == a2[0]) 
                    return a1[1] - a2[1];
                return a1[0] - a2[0];
            }
        });
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        pq.offer(jobs[0]);
        int end = jobs[0][0];
        int sum = 0;
        int idx = 1;
        
        while(!pq.isEmpty()) {
            int[] job = pq.poll();
            end += job[1];
            sum += end - job[0];
            
            while(idx < jobs.length && jobs[idx][0] <= end) {
                pq.offer(jobs[idx++]);
            }
            
            // 진행할 수 있는 작업들이 끝났는데 요청이 아직 안 온 경우
            if (idx < jobs.length && pq.isEmpty()) {
                end = jobs[idx][0];
                pq.offer(jobs[idx++]);
            }
        }
        
        return sum / jobs.length;
    }
}
