import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        int number = arr[0];

        List<Integer> arraylist = new ArrayList();
        
        for (int a : arr) {
                arraylist.add(a);
            }
        int b = 0;
        if (arraylist.size() >=2) {
            for (int i=0; i<arraylist.size(); i++) {
                if (arr[i] <= number) {
                    number = arr[i];
                    b = arraylist.indexOf(number);
                } 
            } arraylist.remove(b);
        } else {
            arr[0] = -1;
            return arr;
        }
        
        
        int[] answer = new int[arraylist.size()];
        int size = 0;
        for (int temp : arraylist) {
            answer[size++] = temp;
        }
        
        return answer;
    }
}
