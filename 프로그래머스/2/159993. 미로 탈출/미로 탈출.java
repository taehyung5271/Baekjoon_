import java.util.*;
class Solution {
    int dy[] = {1,0,-1,0};
    int dx[] = {0,1,0,-1};
    
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        boolean[][] visited = new boolean[n][m];
        int[][] map = new int[n][m];
        int[] start = new int[2];
        int[] lever = new int[2];
        int[] end = new int[2];
        //어차피 레버가 있든 말든 int로 만들어진 2차원 맵에서 bfs를 돌리는거랑 같은결과가나올테니
        //숫자 맵으로 변환한다.
        for(int i=0; i<maps.length;i++){
            for(int j=0; j<maps[0].length();j++){
                switch(maps[i].charAt(j)){
                    case 'S': {
                        start = new int[]{i,j};
                        map[i][j] = 0;
                        break;
                    }
                    case 'O' : {
                        map[i][j] = 0;
                        break;
                    }
                    case 'L' : {
                        map[i][j] = 0;
                        lever = new int[]{i,j};
                        break;
                    }
                    case 'E' : {
                        map[i][j] = 0;
                        end = new int[]{i,j};
                        break;
                    }
                    case 'X' : {
                        map[i][j] = 1;
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
        }
        
        int distLever = 0;
        int distEnd = 0;
        boolean isLever = false;
        boolean isEnd = false;
        Deque<Integer[]> q = new ArrayDeque<>();
        q.offer(new Integer[]{start[0],start[1],distLever});
        visited[start[0]][start[1]] = true;
        while(!q.isEmpty()){
            Integer[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];
            distLever = cur[2];
            
            if(y == lever[0] && x == lever[1]){
                isLever = true;
                visited = new boolean[n][m];
                q.clear();
                break;
            }
            for(int i=0; i<4; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                
                if(ny < 0 || nx < 0 || ny >=n || nx >=m) continue;
                if(visited[ny][nx]) continue;
                if(map[ny][nx] == 1) continue;
                
                q.offer(new Integer[]{ny,nx,distLever+1});
                visited[ny][nx] = true;
            }
        }
        
        q.offer(new Integer[]{lever[0],lever[1],distEnd});
        visited[lever[0]][lever[1]] = true;
        
        while(!q.isEmpty()){
            Integer[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];
            distEnd = cur[2];
            
            if(y == end[0] && x == end[1]){
                isEnd = true;
                break;
            }
            for(int i=0; i<4; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                
                if(ny < 0 || nx < 0 || ny >=n || nx >=m) continue;
                if(visited[ny][nx]) continue;
                if(map[ny][nx] == 1) continue;
                
                q.offer(new Integer[]{ny,nx,distEnd+1});
                visited[ny][nx] = true;
            }
        }
        int answer = 0;
        if(!isLever) return -1;
        if(!isEnd) return -1;
        if(isLever && isEnd) answer = distLever + distEnd;
            

        
        
        
        
        
        return answer;
    }
}