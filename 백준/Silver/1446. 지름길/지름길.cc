//원래 가중치는 점과 점의 거리만큼임
//하지만 지름길이 생기고 가중치가 그만큼 줄어들었음
//0에서 d까지의 거리를 가야되는데 
//지름길을 최대한 이용해서 목적지 d까지 최대한 짧게 가봐라~
#include<bits/stdc++.h>
using namespace std;

//1. 배열 크기를 최대 거리 D(10,000)에 맞춰 넉넉히 설정
vector<pair<int,int>> adj[10001];
vector<int> dist(10001,1e9);//초기값은 충분히 큰 값으로

void dijkstra(int start,int target){
    //가장 맨 위에 작은 값이 있게 하려면 아래와 같이 우선순위큐를 선언해야함.
    priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> pq;
    dist[start] = 0;
    pq.push({0,start});

    
    while(!pq.empty()){
        int here_cost = pq.top().first;
        int u = pq.top().second;
        pq.pop();

        //느슨한 삭제?
        if(dist[u] < here_cost) continue;

        for(auto there : adj[u]){
            int v = there.first;
            int w = there.second;
            
            if(here_cost + w < dist[v]){
                dist[v] = here_cost + w;
                pq.push({dist[v],v});
            }
        }
    }
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n,d;
    cin >> n >> d;

    //2.지름길 입력
    for(int i=0; i<n;i++){
        int u,v,w;
        cin >> u >> v >> w;
        if(v>d) continue; // 목적지보다 멀리 가는 지름길은 무시
        adj[u].push_back({v,w});
    }
    //3.기본 도로 추가
    //0부터 d까지 1씩 가는 간선을 모두 추가

    for(int i = 0; i <d; i++){
        adj[i].push_back({i+1,1});
    }
    dijkstra(0,d); 
    cout << dist[d] << "\n";
    return 0;
}