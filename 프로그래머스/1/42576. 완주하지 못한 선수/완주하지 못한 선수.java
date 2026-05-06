import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer ="";
        Map<String,Integer> m = new HashMap<>();
        for(String player : participant) {
            m.put(player,m.getOrDefault(player,0)+1);
        }
        
        for(String player : completion) {
            m.put(player, m.get(player)-1);
        }
        
        for(String key : m.keySet()) {
            if(m.get(key) != 0) {
                return key;
            }
        }
        return answer;
    }
}