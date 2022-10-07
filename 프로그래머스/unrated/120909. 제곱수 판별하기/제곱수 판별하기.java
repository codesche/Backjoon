class Solution {
     public long solution(long n) {
        long sqrt = (long)Math.sqrt(n);

        if (Math.pow(sqrt, 2) == n) {
            return 1;
        } else {
            return 2;
        }

    }
}