import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[101][101];
        
        for(int[] rect : rectangle){
            int x1 = rect[0]*2;
            int y1 = rect[1]*2;
            int x2 = rect[2]*2;
            int y2 = rect[3]*2;
            
            for(int i = y1; i<= y2; i++){
                for(int j = x1; j <= x2; j++){
                    if(map[i][j] == -1) continue; // 변이 다른 사각형 안에 있을 경우는 무시
                    if(i > y1 && i < y2 && j > x1 && j < x2){
                        map[i][j] = -1;
                    }else {
                        map[i][j] = 1;
                    }
                }
            }    
        }
        return bfs(characterX*2, characterY*2, itemX*2,itemY*2, map);
    }
        
    public int bfs(int startX,int startY,int itemX,int itemY,int[][] map){
        int[] dy = {1,0,-1,0};
        int[] dx = {0,1,0,-1};
        Deque<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[101][101];
        q.offer(new int[]{startY, startX, 0});
        visited[startY][startX] = true;
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            
            if(curr[0] == itemY && curr[1] == itemX) return curr[2]/2;
            for(int i=0; i<4;i++){
                int ny = curr[0] + dy[i];
                int nx = curr[1] + dx[i];
                
                if(ny >= 0 && nx >= 0 && ny <=100 && nx <=100){
                    if(!visited[ny][nx] && map[ny][nx] == 1){
                        visited[ny][nx] =true;
                        q.offer(new int[]{ny,nx,curr[2]+1});
                    }
                }
            }
        }
            
        
        return 0;
    }
        
}