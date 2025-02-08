class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0, maxOpen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen = Math.max(minOpen - 1, 0);
                maxOpen--;
            } else { // '*'
                minOpen = Math.max(minOpen - 1, 0);
                maxOpen++;
            }
            if (maxOpen < 0) return false;
        }
        return minOpen == 0;
    } 
    }