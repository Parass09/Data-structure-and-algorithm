class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";
        int n = digits.length();
        
        for (int len = 2; len <= n; len++) { // Length of numbers
            for (int start = 0; start + len <= n; start++) { // Start index in digits
                int num = Integer.parseInt(digits.substring(start, start + len));
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        
        Collections.sort(result); // Ensure sorting
        return result;
    }
}