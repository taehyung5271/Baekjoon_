#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin >> s;
    
    int zero = 0;
    int one = 0;
    for(char c :s){
        if(c == '0'){
            zero++;
        }else if(c == '1'){
            one++;
        }
    }
    
    zero /= 2;
    one /= 2;
    
    string s2;
    for(char c : s){
        if(c == '1' && one >0){
            one--;
        }else if(c == '1' && one ==0){
            s2 += c;
        }else if(c == '0'){
            s2 += c;
        }
    }
    string s3;
    for(char c : s2){
        if(c == '0' && zero>0){
            s3 += c;
            zero--;
        }else if(c=='0' && zero==0){
            continue;
        }else if(c=='1'){
            s3 += c;
        }
    }
    for(char c : s3){
        cout << c;
    }
    return 0;
}