import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        recursive("",numbers);
        
        int answer =0;
        for(int s : set){
            if(isPrime(s)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isPrime(int n){
        if(n <2) return false;
        for(int i=2; i *i <= n; i++){
            if(n % i==0) return false;
        }
        return true;
    }
    
    public void recursive(String comb, String others){
        if(!comb.equals("")){
            set.add(Integer.parseInt(comb));
        }
        
        for(int i=0; i<others.length();i++){
            recursive(comb+others.charAt(i), others.substring(0,i)+ others.substring(i+1));
        }
    }
}