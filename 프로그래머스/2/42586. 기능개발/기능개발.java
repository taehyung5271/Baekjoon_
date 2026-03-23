import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> deque = new ArrayDeque<>();
        //문제에서 days로 계속 힌트를 주고있었네
        
        for(int i=0; i< progresses.length; i++){
            int remain = 100 - progresses[i];
            //올림 계산
            int days = (remain + speeds[i] - 1) /speeds[i];
            deque.offerLast(days);
        }
        
        List<Integer> result = new ArrayList<>();
        
        while(!deque.isEmpty()) {
            int currentDeployDay = deque.pollFirst();
            int count = 1;
            
            //기준일보다 빨리 끝나는 기능들은 함께 배포(peek로 확인 후 poll)
            while(!deque.isEmpty() && deque.peekFirst() <= currentDeployDay) {
                deque.pollFirst();
                count++;
            }
            result.add(count);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}


