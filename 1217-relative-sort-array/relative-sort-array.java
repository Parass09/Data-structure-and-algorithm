class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
           int[] count = new int[1001];
        
        // Count occurrences of each element in arr1
        for (int num : arr1) {
            count[num]++;
        }
        
        int index = 0;
        int[] result = new int[arr1.length];
        
        // Place elements in arr1 according to the order in arr2
        for (int num : arr2) {
            while (count[num] > 0) {
                result[index++] = num;
                count[num]--;
            }
        }
        
        // Place remaining elements in sorted order
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                result[index++] = i;
                count[i]--;
            }
        }
        
        return result;
    }
}