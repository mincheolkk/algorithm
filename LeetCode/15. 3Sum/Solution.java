import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <=2) {
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        
        List<List<Integer>> answer = new ArrayList<>();
        
        for (int i=0; i < nums.length-2; i++) {
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                    
                } else {
                    // 중복 제거 time limit exceeded
                    // if (answer.contains(Arrays.asList(nums[i],nums[left], nums[right]))) {
                    //     right--;
                    //     left++;
                    //     continue;
                    // }
                    
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    while (left<right && nums[left]==nums[left+1]) {
                        left++;
                    }
                    while (left<right && nums[right]==nums[right-1]) {
                        right--;
                    }
                    right--;
                    left++;
                }
            }  
        } return answer;
    }
}
