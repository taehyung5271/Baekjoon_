#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    string a;
    cin >> n >> a;
    int sum =0;
    for(char c : a){
        sum += c-'0';
    }
    cout << sum ;
}