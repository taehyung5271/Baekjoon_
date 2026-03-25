import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();
        
        for(int i=0; i<n;i++){
            while(!stk.isEmpty() && prices[i] < prices[stk.peek()]){
                int index = stk.pop();
                answer[index] = i - index;
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int index = stk.pop();
            answer[index] = n - 1 - index;
        }
        return answer;
    }
}