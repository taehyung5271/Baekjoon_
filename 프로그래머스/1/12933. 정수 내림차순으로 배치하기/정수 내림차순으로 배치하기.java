import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        
        String str = new String(ch); 
        StringBuilder sb = new StringBuilder(str);
        
        
        answer = Long.parseLong(sb.reverse().toString());
        
        return answer;
    }
}