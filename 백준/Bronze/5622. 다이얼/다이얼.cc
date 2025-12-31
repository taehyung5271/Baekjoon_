#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin >> s;
    int a[26]={3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
    int res=0;
    for(char c:s){
        res += a[c-65];
    }
    cout << res;
}