import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> m = new HashMap<>();
        int n = tangerine.length;
        for(int i=0; i<n; i++){
            m.put(tangerine[i],m.getOrDefault(tangerine[i],0)+1);
        }
        List<Integer> counts = new ArrayList<>(m.values());
        counts.sort(Collections.reverseOrder());
        
        for(int count: counts){
            k -= count;
            answer++;
            if(k<=0){
                return answer;
            }
        }
        return answer;
    }
}