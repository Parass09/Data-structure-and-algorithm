class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        
        for (int i = 0, n = nums.length; i < n - 2; i++) {
            for (int left = i + 1, right = n - 1; left < right;) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                
                if (sum < target) left++;
                else right--;
            }
        }
        return closestSum;
    }
}