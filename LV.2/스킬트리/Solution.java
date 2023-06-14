import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

		    // 문자열을 맵으로
        HashMap<Character, Boolean> skillMap = new HashMap<>();
        for (int i=0; i<skill.length(); i++){
            skillMap.put(skill.charAt(i), true);
        }
        
        for (int i=0; i< skill_trees.length; i++){
            String tmp ="";
            for (int j=0; j<skill_trees[i].length(); j++) {
                if (skillMap.containsKey(skill_trees[i].charAt(j))) {
                    tmp = tmp + skill_trees[i].charAt(j);
                }
            }
            if (skill.indexOf(tmp)==0){
                answer++;
            }
        }
        
        return answer;
    }
}
