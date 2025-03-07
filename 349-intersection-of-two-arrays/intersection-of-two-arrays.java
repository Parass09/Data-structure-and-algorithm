class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) if (set1.contains(num)) resultSet.add(num);
        
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
}