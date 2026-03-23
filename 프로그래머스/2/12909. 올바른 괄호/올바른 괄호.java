import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> q = new ArrayDeque<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '(') q.push(ch);
            else if(q.isEmpty() && ch == ')'){
                return false;
            }else if(!q.isEmpty() && ch == ')'){
                q.pop();
            }
        }

        return q.isEmpty();
    }
}