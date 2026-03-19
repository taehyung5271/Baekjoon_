import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dy= {1,0,-1,0};
        int[] dx= {0,1,0,-1};
        
        if(maps[0][0] == 0) return -1;
        boolean[][] visited = new boolean[n][m];
        Deque<int[]> q = new ArrayDeque<>();
        

        q.offer(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];
            int dist = cur[2];
            
            if( y == n - 1 && x == m - 1) return dist;
            
            for(int i =0; i<4;i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                
                if(nx < 0 || ny < 0 || ny >= n || nx >= m) continue;
                if(visited[ny][nx]) continue;
                if(maps[ny][nx] == 0) continue;
                
                visited[ny][nx] = true;
                q.offer(new int[]{ny,nx,dist + 1});
            }
        }
        return -1;
    }
}