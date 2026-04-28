import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        int n = elements.length;
        for(int i=1; i<=n;i++){
            for(int start=0; start<=n;start++){
                int sum = 0;
                for(int k=0; k<i;k++){
                    sum += elements[(start + k) % n];
                }
                set.add(sum);
            }
            
        }
        
        return set.size();
    }
}

//7, 9, 1, 4
//(16)  (10) (2) (5) (11)
//(17) (11) (6) (12) (20)
//(18) (15) (13) (21) (21)
//(22) (22) (22) (22) (22)