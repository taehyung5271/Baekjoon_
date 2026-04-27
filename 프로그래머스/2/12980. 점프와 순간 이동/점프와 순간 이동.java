import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int N = n;
        int mod = 0;
        while(N != 1){
            mod = N % 2;
            ans += mod;
            N /= 2;
        }
        return ans+1;
    }
}