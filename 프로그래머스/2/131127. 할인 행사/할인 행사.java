import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        // want || number                 discount
        int answer = 0;
        int n = want.length;
        Map<String,Integer> m = new HashMap<>();
        
        
        for (int i = 0; i <= discount.length - 10; i++) {
            boolean isOk = false;
            
            for (int k = 0; k < n; k++) {
                m.put(want[k],number[k]);
            }
            
            for (int j = i; j < i + 10; j++) {
                if (m.containsKey(discount[j])){
                    if (m.get(discount[j]) != 0) {
                    m.put(discount[j], m.get(discount[j]) - 1);
                    }
                }
            }
            
            // HashMap을 전부 돌아서 value가 전부 0일 경우에 isOk = true;
            int temp = m.size();
            int t = 0;
            for (String key : m.keySet()) {
                int value = m.get(key);
                if (value == 0) {
                    t++;
                }
            }
            
            if (t == temp) {
                answer++;
            }
        }
        
        
 
        return answer;
    }
}