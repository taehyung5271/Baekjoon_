#include<bits/stdc++.h>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin >> n;
    int a[n];
    fill(a,a+n,0);
    for(int i=0; i<n;i++){
        cin >> a[i];
    }
    
    sort(a,a+n);
    int acc =a[0];
    int sum =a[0];
    for(int i=1;i<n;i++){
        acc += a[i];
        sum += acc;
    }
    cout << sum;
    
}