import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = num_list;
        int n = num_list.length;
        
        for (int i=0; i<n/2; i++) {
            int temp = answer[n-i-1];
            answer[n-i-1] = answer[i];
            answer[i] = temp;
        }
        return answer;
    }
}