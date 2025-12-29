#include<bits/stdc++.h>
using namespace std;
int main(){
    int t,r;
    string s;
    cin >> t;
    for(int i=0; i<t;i++){
        cin >> r;
        cin >> s;
        for(char c : s){
            for(int j=0;j<r;j++){
                cout << c;
            }
        }
        cout << "\n";
    }
}