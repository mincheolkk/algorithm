import java.util.*;

class Solution {
    
    static HashMap<String, List<Integer>> infoMap = new HashMap<String, List<Integer>>();
    
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
                
        infoToMap(info);
        sortInfoMapScoreList();
        
        for (int i=0; i<query.length; i++) {
            query[i] = query[i].replaceAll(" and ","");
            String[] queryList = query[i].split(" ");

            answer[i] = infoMap.containsKey(queryList[0]) ? binarySearch(queryList[0], Integer.parseInt(queryList[1])) : 0;
        }
        
        return answer;
    }

    void infoToMap(String[] info) {
        for (int i=0; i<info.length; i++) {
            String[] infoArray =info[i].split(" ");
            makeString(infoArray, "", 0);
        }
    }

    void makeString(String[] infoArray, String str, int count) {
        
        if (count == 4){
            if (!infoMap.containsKey(str)) {
                List<Integer> scoreList = new ArrayList<Integer>();
                infoMap.put(str, scoreList);
            }
            infoMap.get(str).add(Integer.parseInt(infoArray[4]));
            return;
        }
        makeString(infoArray, str + "-", count + 1);
        makeString(infoArray, str + infoArray[count], count + 1);
    }

    void sortInfoMapScoreList() {
        for (String key : infoMap.keySet())
            Collections.sort(infoMap.get(key));
    }
    
    private static int binarySearch(String queryString, int score) {
        List<Integer> scoreList = infoMap.get(queryString);
        int start = 0, end = scoreList.size() - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (scoreList.get(mid) < score) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return scoreList.size() - start;
    }
}
