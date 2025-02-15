class Solution {
    public int maxDepth(String s) {
             int depth = 0, maxDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') maxDepth = Math.max(maxDepth, ++depth);
            if (c == ')') depth--;
        }
        return maxDepth;
    }
}