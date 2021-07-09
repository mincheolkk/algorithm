class Solution {
    public String solution(int a, int b) {
        String days[] = new String[] {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] last_days = new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
        
        int first = 0;        
        String answer = "";
        
        for (int i=0; i < a; i++) {
            first += last_days[i];
        }
        
        first += b;
        int day = first%7 - 1;
        
        if(day==-1)day=6;
        answer = days[day];
        return answer;
    }
}
