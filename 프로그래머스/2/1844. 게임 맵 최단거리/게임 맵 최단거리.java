import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dy = {1,0,-1,0};
        int[] dx = {0,1,0,-1};
        
        Deque<int[]> q = new ArrayDeque<>();
        if(maps[0][0] == 0) return -1;
        boolean[][] visited = new boolean[n][m];
        
        q.offer(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int y= curr[0];
            int x= curr[1];
            int dist = curr[2];
            
            if(y == n-1 && x == m-1) return dist;
            
            for(int i=0; i < 4 ; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                
                if(ny < 0 || nx < 0 || ny >=n || nx >=m) continue;
                if(visited[ny][nx]) continue;
                if(maps[ny][nx] ==0 )continue;
                visited[ny][nx] = true;
                q.offer(new int[]{ny,nx,dist + 1});
            }
        }
        return -1;
        
    }
}