import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int n = arr.length;
        
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(arr[0]);
        for(int i=1; i<n;i++){
            if(q.peekLast() == arr[i]) continue;
            q.offer(arr[i]);
        }
        int[] answer = new int[q.size()];
        int i=0;
        while(!q.isEmpty()){
            answer[i++] = q.poll();
        }
        return answer;
    }
}