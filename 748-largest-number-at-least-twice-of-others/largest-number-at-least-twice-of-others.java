class Solution {
    public int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int maxIndex = 0;
        int maxValue = nums[0];
        int secondMax = Integer.MIN_VALUE;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                secondMax = maxValue;
                maxValue = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        
        return (maxValue >= 2 * secondMax) ? maxIndex : -1;
    }
    }
