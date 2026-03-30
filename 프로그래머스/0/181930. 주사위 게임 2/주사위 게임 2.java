class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int mx = 1;
        
        if(a == b && b == c) mx = 3;
        else if(a == b || b == c || c == a) mx =2;
        else{
            mx =1;
        }
        

        for(int i=1; i<=mx; i++){
            answer *= (Math.pow(a,i) +Math.pow(b,i) +Math.pow(c,i)); 
        }   
        
        return answer;
    }
}