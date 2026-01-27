#include<bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    long long h,w,n,m;
    cin >> h >> w >> n >> m;
    
    long long a = ceil((double)h / (n + 1));
    long long b = ceil((double)w / (m + 1));
    
    cout << a * b;
    
    return 0;
}