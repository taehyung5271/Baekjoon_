import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String,Integer> m = new HashMap<>();
        for(String s : phone_book){
            m.put(s,1);
        }
        
        for(String number : phone_book){
            for(int j=0; j<number.length();j++){
                if(m.containsKey(number.substring(0,j))){
                    return false;   
                }
            }
        }
        return answer;
    }
}