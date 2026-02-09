#include<bits/stdc++.h>
using namespace std;

vector<pair<int,int>> adj[10001];
vector<int> dist(10001,1e9);

void dijkstra(int start){
    priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>>> pq;
    dist[start] = 0;
    pq.push({0,start});
    
    while(!pq.empty()){
        int here_cost = pq.top().first;
        int u = pq.top().second;
        pq.pop();
        
        if(dist[u] < here_cost) continue;
        
        for(auto there : adj[u]){
            int w = there.first;
            int v = there.second;
            
            if(here_cost + w < dist[v]){
                dist[v] = here_cost + w;
                pq.push({dist[v],v});
            }
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n,d;
    cin >> n >> d;
    for(int i=0; i<n;i++){
        int u,v,w;
        cin >> u >> v >> w;
        if(v > d) continue;
        adj[u].push_back({w,v});
    }
    for(int i=0; i<d;i++){
        adj[i].push_back({1,i+1});
    }
    dijkstra(0);
    cout << dist[d];
    return 0;
}