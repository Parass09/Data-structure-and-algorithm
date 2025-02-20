class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Base case: sum 0 at index -1
        
        int sum = 0; 
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            // Treat 0 as -1, 1 remains 1
            sum += (nums[i] == 0) ? -1 : 1;

            // If this sum was seen before, update max length
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                // Store the first occurrence of the sum
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}