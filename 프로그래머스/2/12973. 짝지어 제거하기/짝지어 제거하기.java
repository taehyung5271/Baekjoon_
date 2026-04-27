import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Deque<Character> stk = new ArrayDeque<>();
        stk.push(s.charAt(0));
        
        for(int i=1; i<s.length();i++){
            if(!stk.isEmpty()){
                if(s.charAt(i) == stk.peek()){
                    stk.pop();
                }else{
                    stk.push(s.charAt(i));
                }
            }else {
                stk.push(s.charAt(i));
            }
        }
        if(stk.isEmpty()){
            answer = 1;
        }else {
            answer = 0;
        }
        return answer;
    }
}