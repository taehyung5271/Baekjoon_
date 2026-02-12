#include<bits/stdc++.h>
using namespace std;
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 2
//1 1 1 1 1 1 2 2
//1 1 1 1 2 2 2
//1 1 2 2 2 2
//2 2 2 2 2
//1 1 1 1 1 5
//1 1 1 2 5
//1 2 2 5
//5 5

int N,K;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin >> N >> K; 
    vector<int> coin(N);
    for(int i=0; i<N;i++){
        cin >> coin[i];
    }
    vector<int> dp(K+1,0);

    //동전 아무것도 사용하지 않았을 경우!
    dp[0] = 1;
    
    for(int i=0; i<N;i++){
        //가치가 큰 동전부터 사용해서 k의 가치로 만들어가라
        for(int j=coin[i]; j<=K; j++){
            dp[j] = dp[j] + dp[j-coin[i]];           
        }
    }

    cout << dp[K];

    
    return 0;
}