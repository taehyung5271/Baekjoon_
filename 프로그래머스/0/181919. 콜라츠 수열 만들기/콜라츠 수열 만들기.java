import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int res = n;
        answer.add(res);
        while(res != 1){
            if(res % 2 ==0){
                res /= 2;
            }else {
                res = 3*res + 1;
            }
            answer.add(res);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}