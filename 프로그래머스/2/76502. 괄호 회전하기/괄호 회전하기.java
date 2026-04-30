import java.util.*;
class Solution {
    
    public int solution(String s) {
        int answer = 0;
        
        Deque<Character> stk;

        for(int i=0; i<s.length(); i++){
            String str = s.substring(i) + s.substring(0,i);
            stk = new ArrayDeque<>();
            for(int j=0; j< str.length();j++){
                if (str.charAt(j) == '(' || str.charAt(j) == '[' || str.charAt(j) == '{') {
                    stk.push(str.charAt(j));
                } else if (!stk.isEmpty()) {
                    if ( (stk.peek() == '(' && str.charAt(j) == ')') || (stk.peek() == '[' && str.charAt(j) == ']') || (stk.peek() == '{' && str.charAt(j) == '}') ) {
                        stk.pop();
                    }
                } else {
                    stk.push(str.charAt(j));
                }
                
            }
            
            
            if(stk.isEmpty()){
                answer += 1;
            }
            
        }

        
        
        return answer;
    }
}