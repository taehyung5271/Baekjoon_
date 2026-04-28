import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        //Map<Integer, Integer> key: 크기, value: 갯수
        //value를 내림차순으로 정렬하고
        //(k-value)를 한번 할때마다 result++
        //k-value <= 0 이되면 return result;
        
        
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0; i<tangerine.length;i++){
            m.put(tangerine[i], m.getOrDefault(tangerine[i],0)+1);
        }
        List<Integer> counts = new ArrayList<>(m.values());
        
        counts.sort(Collections.reverseOrder());
        
        for(int count: counts){
            k -= count;
            answer++;
            if(k <= 0){
                return answer;
            }
            
        }
        
        return answer;
    }
}