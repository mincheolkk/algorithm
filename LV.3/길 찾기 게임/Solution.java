import java.util.*;

class Solution {
    
    int[][] result;
	  int idx;
    
    public int[][] solution(int[][] nodeinfo) {
        //노드를 입력받는다.
        Node[] node = new Node[nodeinfo.length];
        for(int i = 0; i < nodeinfo.length; i++) {
            System.out.println(i+1);
            node[i] = new Node(nodeinfo[i][0], nodeinfo[i][1], i + 1, null, null);
            System.out.println(node[i].value);   
        }
        
        //y값 큰 순서대로, y값 같다면 x값 작은 순서대로 정렬
        Arrays.sort(node, new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                if(n1.y == n2.y) {
                    return n1.x - n2.x;
                } else {
                    return n2.y - n1.y;
                }
            }
        });
        
        // 트리 만들기
        Node root = node[0];
        for (int i=1; i < node.length; i++) {
            insertNode(root, node[i]);
        }
        
        // 순회 돌기
        result = new int[2][nodeinfo.length];
        
        idx = 0;
        preOrder(root);
  
        idx = 0;
        postOrder(root);
        
        return result;
    }
    
    public void insertNode(Node parent, Node child) {
        if (parent.x > child.x) {
            if (parent.left == null) parent.left = child;
            else insertNode(parent.left, child);
        } else {
            if (parent.right == null) parent.right = child;
            else insertNode(parent.right, child);
        }
    }
    
    // Root - left - right
    public void preOrder(Node root) {
        if (root != null) {
            // root
            result[0][idx++] = root.value;
            // left
            preOrder(root.left);
            // right
            preOrder(root.right);
        }
    }
    
    // left - right - root
    public void postOrder(Node root) {
        if(root != null) {
            // left
            postOrder(root.left);
            // right
            postOrder(root.right);
            // root
            result[1][idx++] = root.value;
        }
    }
    
    public class Node {
        int x;
        int y;
        int value;
        Node left;
        Node right;
        
        public Node(int x, int y, int value, Node left, Node right) {
            this.x = x;
            this.y = y;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
