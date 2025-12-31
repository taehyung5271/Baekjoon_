#include<bits/stdc++.h>
using namespace std;
string s;

int main(){
    getline(cin, s);
    int ret = 1;
    if(s.size() == 1 && s[0] == ' '){
        cout << 0;
        return 0;
    }
    for(int i=1; i<s.size()-1;i++){
        if(s[i] == ' ') ret++;
    }
    
    cout << ret;
    
    return 0;
}