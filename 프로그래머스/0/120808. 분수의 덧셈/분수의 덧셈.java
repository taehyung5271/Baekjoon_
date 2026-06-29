class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int answerdenom = denom1 * denom2;
        int answernumer = numer1 * denom2 + numer2 * denom1;
        
        
        int n = gcd(answerdenom,answernumer);
        int[] answer = {answernumer/n,answerdenom/n};
        return answer;
    }
    public int gcd(int a, int b) {
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
        return a;
    }
}