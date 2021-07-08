class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ",-1);
        
        for (int i=0; i < str.length; i++) {
            for (int j=0; j < str[i].length(); j++) {
                if (j%2 ==0) {
                    str[i] = str[i].toUpperCase();
                    String temp = Character.toString(str[i].charAt(j));
                    answer += temp;
                } else {
                    str[i] = str[i].toLowerCase();
                    String temp = Character.toString(str[i].charAt(j));
                    answer += temp;
                }
            } answer += " ";
        }
        return answer.substring(0,answer.length()-1);
    }
}
