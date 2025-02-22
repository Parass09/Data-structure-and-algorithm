class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false; // Powers of 3 must be positive
        }

        while (n % 3 == 0) {  // Keep dividing by 3 if divisible
            n /= 3;
        }

        return n == 1;
    }
}