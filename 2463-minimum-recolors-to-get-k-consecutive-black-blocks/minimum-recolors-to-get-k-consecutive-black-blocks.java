class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minOps = k, blackCount = 0;
        
        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'B') blackCount++;
            if (i >= k && blocks.charAt(i - k) == 'B') blackCount--;
            if (i >= k - 1) minOps = Math.min(minOps, k - blackCount);
        }
        
        return minOps;
    }
}