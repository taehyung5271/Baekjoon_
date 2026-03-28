import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String,Integer> m = new HashMap<>();
        for(String phone : phone_book){
            m.put(phone,1);
        }
        
        for(String number : m.keySet()){
            for(int i=0; i<number.length(); i++){
                if(m.containsKey(number.substring(0,i))){
                    return false;
                }
            }
        }
        return true;
    }
}