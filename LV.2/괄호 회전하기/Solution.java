import java.util.*;

class Solution {
    
    static HashMap<String, String> left = new HashMap<>() {{
        put("(",")");
        put("[","]");
        put("{","}"); 
    }};
    static Stack leftStack = new Stack<>();
    static Stack rightStack = new Stack<>();
    
    public static boolean check(String s, int idx) {

        while(idx<s.length()) {
            
            if (s.length()-1 == idx) {
                if (left.containsKey(String.valueOf(s.charAt(idx)))){
                    leftStack.push(String.valueOf(s.charAt(idx)));
                } else {
                    rightStack.push(String.valueOf(s.charAt(idx)));
                }
                
                if (leftStack.size() != rightStack.size()) return false;

                while(!leftStack.isEmpty() && !rightStack.isEmpty()){
                    String tmp = String.valueOf(rightStack.pop());
                    if (left.get(leftStack.pop()).equals(tmp)) {
                        continue;        
                    } else {
                        return false;
                    }
                }   

                return true;
            }

            if(left.containsKey(String.valueOf(s.charAt(idx)))) {
                if(left.containsKey(String.valueOf(s.charAt(idx+1)))){
                    leftStack.push(String.valueOf(s.charAt(idx)));
                    idx++;
                    continue;
                } else {
                    String tmp = String.valueOf(s.charAt(idx+1));
                    if(left.get(String.valueOf(s.charAt(idx))).equals(tmp)){
                        if (idx+1 != (s.length()-1)) {
                            idx++;
                            idx++;
                            continue;
                        } else return true;
                    } else {
                        return false;
                    }
                }
            } else {
                rightStack.push(String.valueOf(s.charAt(idx)));
                idx++;
            }
        }
        return true;
    }
    
    public int solution(String s) {
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (check(s,0)){
                count++;
            }
            String firstString = s.substring(0,1);
            s = s.substring(1, s.length());
            s += firstString;
        }
        return count;
    }
}
