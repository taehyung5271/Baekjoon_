#include<bits/stdc++.h>
using namespace std;
//항상 {1,1}에서 {N,M}까지는 달려가는 것이 목적
//벽을 한 번 뚫어서 최단 경로를 만들 수 있으면 한 번 뿌셔도 됨
//그냥 길이 뚫려 있어서 bfs로 최단거리를 찾아내도
//벽 한 번 뿌셔서 bfs를 돌렸을 때 더 짧은 거리가 나타날수도 있음.

//시작은 bfs를 구성하는데 
//for(int i=0; i<4;i++){
// int ny = y + dy[i];        
// int nx = x + dx[i];
// arr[ny][nx]== 1
// }
//일 때 isBroken이 false이면
//한 번 부실 수 있게 하기.
//근데 한 번 부시면은 못부시게 되는데 더 짧게 갈 수 있는 벽이 있을 수도 있지않나..
//그걸 해소할 수 있는 arr2가 있어야되는지..
//그 해소를 3차원 배열로 늘려서 해보자
bool isBroken = false;
int visited[1004][1004][2];
int arr[1004][1004];
int dy[4] = {1,0,-1,0};
int dx[4] = {0,1,0,-1};
int N,M;

int bfs(){
    queue<pair<pair<int,int>,int>> q;
    q.push({{0,0},0});
    visited[0][0][0]=1;
    while(!q.empty()){
        int y = q.front().first.first;
        int x = q.front().first.second;
        int b = q.front().second;
        q.pop();
        //기저사례
        if(y == N-1 && x == M-1) {
            return visited[y][x][b];
        }
        
        for(int i=0; i<4;i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if(ny < 0 || nx < 0 || ny >= N || nx >= M) continue;
            //갈수 있는 곳이라면
            if(arr[ny][nx] == 0){
                //그리고 방문하지 않은 곳이라면
                if(visited[ny][nx][b] == 0){
                    visited[ny][nx][b] = visited[y][x][b] + 1;
                    q.push({{ny,nx},b});
                }
            //다음 공간이 벽이 쳐져 있다면
            }else if(arr[ny][nx] == 1){
                //그리고 부셔본 적이 없고
                if(b == 0){
                    //부신 상태로 방문하지 않았다면
                    if(visited[ny][nx][1] == 0){
                        visited[ny][nx][1] = visited[y][x][0] + 1;
                        q.push({{ny,nx},1});
                    }
                }
            }
        }
    }
    return -1;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin >> N >> M;
    string s[N];
    for(int i=0; i<N;i++){
        cin >> s[i];
    }
    for(int i=0; i<N;i++){
        for(int j=0;j<s[i].length();j++){
            arr[i][j]=s[i][j]-'0';
        }
    }

    cout << bfs();
    
    return 0;
    
}