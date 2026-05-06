class Solution {
    public long solution(long n) {
        long a = (long)Math.sqrt(n);
        long b = (long)Math.pow(a,2);
        if( b == n ) {
            return (long)Math.pow(a+1,2);
        }
        return -1;
    }
}