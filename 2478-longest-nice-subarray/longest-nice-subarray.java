class Solution {
    public int longestNiceSubarray(int[] nums) {
    int maxLength = 0, andValue = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            while ((andValue & nums[right]) != 0) {
                andValue ^= nums[left]; 
                left++;
            }
            
            andValue |= nums[right]; 
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}