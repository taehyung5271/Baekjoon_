import java.util.*;
class Solution {
    ArrayList<Integer>[] adj;
    int minDiff = Integer.MAX_VALUE;
    public int solution(int n, int[][] wires) {
        adj = new ArrayList[n + 1];
        for(int i=1; i<=n; i++) adj[i] = new ArrayList<>();
        
        for(int wire[] : wires){
            adj[wire[0]].add(wire[1]);
            adj[wire[1]].add(wire[0]);
        }
        
        for(int wire[] : wires){
            int v1 = wire[0];
            int v2 = wire[1];
            
            adj[v1].remove(Integer.valueOf(v2));
            adj[v2].remove(Integer.valueOf(v1));
            
            int count = bfs(v1,n);
            
            int diff = Math.abs(count - (n-count));
            minDiff = Math.min(diff,minDiff);
            
            adj[v1].add(v2);
            adj[v2].add(v1);
        }
    
        return minDiff;
    }
    
    public int bfs(int start, int n){
        boolean[] visited = new boolean[n+1];
        Deque<Integer> q = new ArrayDeque<>();
        visited[start] = true;
        q.offer(start);
        int cnt = 1;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int next : adj[curr]){
                if(!visited[next]){
                    visited[next] = true;
                    q.offer(next);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}