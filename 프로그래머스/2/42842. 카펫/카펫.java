import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for(int h = 3; h<=total;h++){
            int w = total / h;
            
            if(w < h) continue;

            if((w-2)*(h-2) == yellow){
                answer[0] = w;
                answer[1] = h;
                break;
            }
        }
        return answer;
    }
}