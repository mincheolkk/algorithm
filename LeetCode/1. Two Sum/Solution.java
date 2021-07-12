import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();
        int i = 0;
        
        while (i < nums.length) {
            if (dict.containsKey(nums[i]))
                return new int[] {dict.get(nums[i]), i};
            dict.put(target - nums[i], i);
            i++;
        }
        return new int[] {};
    }
}
