#include<bits/stdc++.h>
using namespace std;
int _white[6] = {1,1,2,2,2,8};
int main(){
    int a;
    for(int i=0; i<6;i++){
        cin >> a;
        _white[i] -= a;
    }
    for(int a : _white){
        cout << a << " ";
    }
    return 0;
}