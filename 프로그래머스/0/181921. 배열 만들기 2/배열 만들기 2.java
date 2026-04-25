import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for(int i = 1; ; i++){
            String binary = Integer.toBinaryString(i);
            
            long num = Long.parseLong(binary) * 5;
            
            if(num > r) break;
            
            if(num >= l){
                result.add((int)num);
            }
            
        }
        if(result.isEmpty()){
            result.add((int)-1);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}