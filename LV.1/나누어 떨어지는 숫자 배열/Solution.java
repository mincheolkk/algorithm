class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        Arrays.sort(arr);
        
        for (int i=0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list1.add(arr[i]);
            } else {
                list2.add(arr[i]);
            }
        }
        
        if (list2.size() == arr.length) {
            int[] answer = {-1};
            return answer;
        } 
        
        int[] answer = new int[list1.size()];
        for (int i=0; i<list1.size(); i++) {
            answer[i] = list1.get(i);
        }
        
        return answer;
    }
}
