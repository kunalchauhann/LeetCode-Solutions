class Solution {
    public boolean isPowerOfTwo(int n) {

        long x = 1;

        for(int i = 1; i < n; i++) {

            x *= 2;

            if(x == n) {
                return true;
            }

            if(x > n) {
                return false;
            }
        }

        return x == n;
    }
}