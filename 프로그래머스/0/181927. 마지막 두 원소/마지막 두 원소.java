import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<num_list.length;i++){
            answer.add(num_list[i]);
        }
        if(num_list[num_list.length-1] > num_list[num_list.length-2]){
            answer.add(num_list[num_list.length-1] - num_list[num_list.length-2]);
        }else{
            answer.add(num_list[num_list.length-1]*2);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}