import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int n = topping.length;
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) { // map에 일단 갯수와 함께 다 집어넣어
            map.put(topping[i],map.getOrDefault(topping[i],0)+1);
        }
        
        for(int t : topping) { 
            set.add(t);
            if(map.get(t)==1){
                map.remove(t);
            } else {
                map.put(t,map.get(t)-1);
            }
            
            if(set.size() == map.size()){
                answer++;
            }
        }
        
        return answer;
    }
}