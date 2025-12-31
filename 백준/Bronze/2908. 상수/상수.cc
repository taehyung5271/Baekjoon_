#include<bits/stdc++.h>
using namespace std;
int main(){
    string a,b;
    cin >> a >> b;
    reverse(a.begin(),a.end());
    reverse(b.begin(),b.end());
    stoi(a);
    stoi(b);
    if(a>b){
        cout << a;
    }else cout << b;
    return 0;
}