class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int[] pair : nums1) map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        for (int[] pair : nums2) map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        
        int[][] result = new int[map.size()][2];
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        
        int index = 0;
        for (int key : keys) {
            result[index++] = new int[]{key, map.get(key)};
        }
        
        return result;
    }
}