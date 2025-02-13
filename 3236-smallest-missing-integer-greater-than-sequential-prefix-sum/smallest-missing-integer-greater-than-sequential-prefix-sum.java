class Solution {
    public int missingInteger(int[] nums) {
         int sum = nums[0];
        int i = 1;
        
        // Find the longest sequential prefix
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }
        
        // Find the smallest missing integer greater than or equal to sum
        while (contains(nums, sum)) {
            sum++;
        }
        
        return sum;
    } 
     private boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}