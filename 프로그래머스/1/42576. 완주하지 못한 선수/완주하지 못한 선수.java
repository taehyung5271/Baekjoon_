import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> m = new HashMap<>();
        for(String p : participant){
            m.put(p, m.getOrDefault(p,0)+1);
        }
        for(String c : completion){
            m.put(c,m.get(c)-1);
        }
        for(String key : m.keySet()){
            if(m.get(key) != 0 ){
                return key;
            }
        }

        return "";
    }
}