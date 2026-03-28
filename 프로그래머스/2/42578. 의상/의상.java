import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String,Integer> kinds = new HashMap<>();
        for(String[] cloth : clothes){
            kinds.put(cloth[1],kinds.getOrDefault(cloth[1],0)+1);
        }
        int result =1;
        for(String key : kinds.keySet()){
            result *= kinds.get(key)+1;
        }
        result -= 1;
        return result;
    }
}