import java.util.*;
class Solution {
    public long solution(int[] queue1, int[] queue2) {
        Deque<Long> q1 = new ArrayDeque<>();
        Deque<Long> q2 = new ArrayDeque<>();
        
        long sum = 0;
        for(long a : queue1){
            sum += a;
            q1.offer(a);
        }
        for(long a : queue2){
            sum += a;
            q2.offer(a);
        }
        
        if(sum % 2 == 1) return -1; // 총합이 홀수 일 경우 두개의 큐가 같을 수 없다.
        long target = sum / 2; //각 큐를 절반으로 잘라서 목표를 정함
        
        long count = 0;
        
        long sum2 = 0;
        for(long a : q1){
            sum2 += a; // sum2 is q1`s sum 
        }
        while(count != 3*queue1.length){   
            long top;
            if(sum2 > target){
                top = q1.poll();
                sum2 -= top;
                q2.offer(top);
            }else if(sum2 < target){
                top = q2.poll();
                sum2 += top;
                q1.offer(top);
            }else {
                return count;
            }
            count++;
            
        }
        
        
        
        return -1;
    }
}