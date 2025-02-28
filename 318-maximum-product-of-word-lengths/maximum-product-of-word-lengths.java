class Solution {
    public int maxProduct(String[] words) {
        int n = words.length, maxProduct = 0;
        int[] masks = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (char c : words[i].toCharArray())
                masks[i] |= 1 << (c - 'a');
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0)
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
            }
        }
        
        return maxProduct;
    }
}