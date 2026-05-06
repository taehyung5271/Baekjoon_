import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) return 5 * cities.length;
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String city : cities){
            String str = city.toUpperCase();
            if(map.containsKey(str)) {
                map.remove(str);
                map.put(str,1);
                answer += 1;
            } else {
                if ( map.size() < cacheSize ) {
                    map.put(str,1);
                } else {
                    String oldValue = map.keySet().iterator().next();
                    map.remove(oldValue);
                    map.put(str,1);
                }
                answer += 5;
            }
        }
        
        return answer;
    }
}