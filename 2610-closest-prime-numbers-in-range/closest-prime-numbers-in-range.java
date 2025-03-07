class Solution {
    public int[] closestPrimes(int left, int right) {
                List<Integer> primes = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) primes.add(i);
        }
        
        if (primes.size() < 2) return new int[]{-1, -1};
        
        int num1 = primes.get(0), num2 = primes.get(1), minDiff = num2 - num1;
        
        for (int i = 1; i < primes.size() - 1; i++) {
            int diff = primes.get(i + 1) - primes.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                num1 = primes.get(i);
                num2 = primes.get(i + 1);
            }
        }
        
        return new int[]{num1, num2};
    }
        private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}