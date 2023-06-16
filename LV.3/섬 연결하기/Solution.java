import java.util.*;

class Solution {
    
    static int[] parent;
    
    public int solution(int n, int[][] costs) {
        // 건설 비용기준으로 오름차순 정렬
        Arrays.sort(costs, (int[] c1, int[] c2) -> c1[2]-c2[2]);
        
        parent = new int[n];
        
        // 자기 자신으로 부모 초기화
        for (int i=0; i<n; i++) {
            parent[i] = i;
        }
        
        int totalCost = 0;
        
        for (int[] edge: costs) {
            int from = edge[0];
            int to = edge[1];
            int cost = edge[2];
            
            int fromParent = findParent(from);
            int toParent = findParent(to);
            
            // 부모 노드가 같으면 연결된거니 패스!
            if (fromParent == toParent) continue;
            
            // 다르면 노드를 연결하는 것이니, 부모 노드 갱신
            parent[toParent] = fromParent;
            
            // 건설 비용 더하기
            totalCost += cost;
        }
   
        return totalCost;
    }
    
    int findParent(int node) {
        // 부모 노드인지 확인
        if (parent[node] == node) return node;
        return parent[node] = findParent(parent[node]);
    }
}
