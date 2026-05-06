class Solution {
    public boolean solution(int x) {
        int n = x;
        int res = 0;
        while(x != 0) {
            res += x % 10;
            x /= 10;
        }
        if( n % res == 0){
            return true;
        } else {
            return false;
        }
    }
}