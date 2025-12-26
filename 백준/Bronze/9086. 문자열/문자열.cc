#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    string a[n];
    for(int i=0; i<n;i++){
        cin >> a[i];
    }
    for(int i=0; i<n;i++){
        cout << a[i][0] << a[i][a[i].length()-1] << "\n";
    }
    return 0;
}