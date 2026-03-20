import java.util.*;
class Solution {
    boolean canChange(String a, String b){
        int diff = 0;
        for(int i=0; i<a.length();i++){
            if(a.charAt(i) != b.charAt(i)) diff++;
            if(diff > 2) return false;
            
        }
        return diff == 1;
    }
    public int solution(String begin, String target, String[] words) {
        boolean hasTarget = false;
        for(String w: words){
            if(w.equals(target)){
                hasTarget = true;
                break;
            }
        }
        if(!hasTarget) return 0;
        
        boolean[] visited = new boolean[words.length];
        Deque<int[]> q = new ArrayDeque<>();
        
        for(int i=0; i<words.length; i++){
            if(canChange(begin,words[i])) {
                visited[i] = true;
                q.offer(new int[]{i,1});
            }
        }
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int idx = curr[0];
            int depth = curr[1];
            
            if(words[idx].equals(target)) return depth;
            
            for(int i=0; i<words.length;i++){
                if(!visited[i] && canChange(words[idx],words[i])){
                    visited[i] = true;
                    q.offer(new int[]{i,depth+1});
                }
            }
        }
        

        return 0;
    }
    
}