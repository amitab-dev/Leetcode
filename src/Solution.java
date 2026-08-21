import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[]nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                return new int[]{i, map.get(needed)};
            } else  {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
