#include<bits/stdc++.h>
using namespace std;
vector<string> s;
int main(){
    string temp;
    while(getline(cin,temp)){
        s.push_back(temp);
    }
    for(string a : s){
        cout << a << "\n";
    }
    return 0;
}