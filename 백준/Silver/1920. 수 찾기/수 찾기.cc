#include<bits/stdc++.h>
using namespace std;

bool find(const vector<int>& v, int findNumber){
    int l=0;
    int r=v.size()-1;


    while(l <= r){
        int mid = (l+r)/2;
        if(v[mid] < findNumber){
            l = mid +1;
        }else if(v[mid] > findNumber){
            r = mid - 1;
        }else{
            return true;
        }
    }
    return false;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int n,m;
    cin >> n;
    vector<int> v(n);
    for(int i=0; i<n;i++){
        cin >> v[i];
    }

    sort(v.begin(),v.end());
    cin >> m;
    for(int i=0;i<m;i++){
        int temp;
        cin >> temp;
        if(find(v,temp)){
            cout << 1 << "\n";
        }else
            cout << 0 << "\n";
    }
    return 0;
}