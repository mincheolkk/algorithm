import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dict = new HashMap();
        List<List<String>> answer = new ArrayList<List<String>>();
        
        for (int i=0; i < strs.length; i++) {
            String str = strs[i];
            char[] stringTochar = str.toCharArray();
            Arrays.sort(stringTochar);
            String sortedstr = new String(stringTochar);
            
            List<String> valueList = new ArrayList<String> ();
            
            if (!dict.containsKey(sortedstr)) {
                valueList.add(str);
                dict.put(sortedstr, valueList);
            } else {
                List<String> temp = dict.get(sortedstr);
                temp.add(str);
                dict.replace(sortedstr, temp);
            }
        }
        
        // for (String key : dict.keySet() ) {
        //     List<String> str_list = dict.get(key);
        //     answer.add(str_list);
        // }
        // return answer;
        return new ArrayList(dict.values());
    }
}
