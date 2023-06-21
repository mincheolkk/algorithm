import java.util.ArrayList;

class Solution {
    
    static ArrayList<Integer> resultList = new ArrayList<>();

    public int solution(String numbers) {
        int len = numbers.length();
        int[] arr = new int[len];
        
        // String 하나하나 꺼내서 int로 바꾸고 리스트로 변환
        for(int i=0; i<len; i++) {
            arr[i] = numbers.charAt(i) - '0';
        } 

        // 각 자리수만큼 순열
        for(int i=1; i<=len; i++) {
            permutation(arr, 0, len, i);
        }
        return resultList.size();
    }

    // 순열
    void permutation(int[] arr, int depth, int n, int r) {
      
        if(depth == r) {
            // 각 자리수만큼 도달했으니 이제 찾기
            String number = "";
            for(int i=0; i<r; i++) {
                number += arr[i];
            }

            if(isPrime(Integer.valueOf(number)) && !resultList.contains(Integer.valueOf(number))) {
                resultList.add(Integer.valueOf(number));
            }

            return;
        }

        for(int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    // 소수 판별
    boolean isPrime(int n){
        if(n<2) return false;

        for(int i=2; i<=(int) Math.sqrt(n); i++) {
            if(n%i == 0) {
               return false;
            }
        }

        return true;
    }
}
