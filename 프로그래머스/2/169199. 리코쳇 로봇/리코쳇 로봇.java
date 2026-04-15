import java.util.*;

class Solution {
    int dy[] = {1,0,-1,0};
    int dx[] = {0,1,0,-1};
    
    public int solution(String[] board) {
        Deque<Integer[]> q = new ArrayDeque<>();
        int answer = 0;
        int n = board.length;
        int m = board[0].length();
        
        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[] start;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(board[i].charAt(j) == 'R'){
                    start = new int[]{i,j};
                    q.offer(new Integer[]{i,j,0});
                    visited[i][j] = true;
                }
                if(board[i].charAt(j) == 'G'){
                    map[i][j] = 2;
                }
                else if(board[i].charAt(j) == 'D'){
                    map[i][j] = 1;
                }
            }
        }
        
        
        while(!q.isEmpty()){
            Integer[] curr = q.poll();
            int y = curr[0];
            int x = curr[1];
            int count = curr[2];
            
            if(map[y][x] == 2) return count;
            
            for(int i=0; i<4; i++){
                int ny = y;
                int nx = x;
                while(true){
                    int ty = ny + dy[i];
                    int tx = nx + dx[i];
                    
                    if(tx < 0 || ty < 0 || tx>=m || ty >=n || map[ty][tx] ==1){
                        break;
                    }
                    ny = ty;
                    nx = tx;
                }
                
                if(!visited[ny][nx]){
                        visited[ny][nx] = true;
                        q.offer(new Integer[]{ny,nx,count+1});
                    }
                
            }
        }
        
        
        
        
        return -1;
    }
}