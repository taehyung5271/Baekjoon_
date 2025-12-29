#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin >> s;
    int a[26];
    fill(a,a+26,-1);
    for(int i=0; i<s.length();i++){
        if(a[s[i]-'a']!=-1){
            continue;
        }    
        a[s[i]-'a'] = i;
    }
    for(int i=0; i<26;i++){
        cout << a[i] << " ";
    }
    return 0;
}