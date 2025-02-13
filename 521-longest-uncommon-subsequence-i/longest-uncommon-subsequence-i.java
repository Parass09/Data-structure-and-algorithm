class Solution {
    public int findLUSlength(String a, String b) {
         if (a.equals(b)) {
            return -1;
        }
        // Otherwise, the longer string itself is the longest uncommon subsequence
        return Math.max(a.length(), b.length());
    }
}