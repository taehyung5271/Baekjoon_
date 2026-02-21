#include<bits/stdc++.h>
using namespace std;
int T, W, H;
int f_visited[1004][1004], s_visited[1004][1004];
queue<pair<int,int>> fire,sangeun;
char arr[1004][1004];
int dy[] = {1,0,-1,0};
int dx[] = {0,1,0,-1};

void f_bfs(){
    while(!fire.empty()){
        int y = fire.front().first;
        int x = fire.front().second;
        fire.pop();    

        for(int i=0; i<4;i++){
            int ny = y+dy[i];
            int nx = x+dx[i];

            if(ny < 0 || nx < 0 || ny >= H || nx >= W) continue;
            if(arr[ny][nx] == '#' || f_visited[ny][nx] != 1e9) continue;
            fire.push({ny,nx});
            f_visited[ny][nx] = f_visited[y][x] + 1;
        }
    }
}

int s_bfs(){
    while(!sangeun.empty()){
        int y = sangeun.front().first;
        int x = sangeun.front().second;
        sangeun.pop();
        for(int i=0; i<4;i++){
            int ny = y+dy[i];
            int nx = x+dx[i];

            if(ny < 0 || nx < 0 || ny >= H || nx >= W ) return s_visited[y][x];
            if(arr[ny][nx] == '#' || arr[ny][nx] == '*' || s_visited[ny][nx]) continue;
            // f_visited가 1e9라면 불이 안 오는 곳이라 무조건 통과
            if(f_visited[ny][nx] <= s_visited[y][x]+1) continue;
            s_visited[ny][nx] = s_visited[y][x]+1;
            sangeun.push({ny,nx});
        }
    }
    return -1;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin >>T;
    while(T--){
        cin >> W >> H;
        //queue 초기화
        fire = queue<pair<int,int>>();
        sangeun = queue<pair<int, int>>();
        // 1e9는 '불이 영원히 도달하지 않음'을 의미
        fill(&f_visited[0][0],&f_visited[0][0]+1004*1004, 1e9);
        fill(&s_visited[0][0],&s_visited[0][0]+1004*1004, 0);
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                cin >> arr[i][j];
                if(arr[i][j] == '@'){
                    sangeun.push({i,j});
                    s_visited[i][j] = 1;
                }
                if(arr[i][j] == '*'){
                    fire.push({i,j});
                    f_visited[i][j] = 1;
                }
            }
        }
        f_bfs();
        int result = s_bfs();
        if(result == -1){
            cout << "IMPOSSIBLE" << "\n";
        }else{
            cout << result << "\n";
        }
        
    }
    return 0;
}