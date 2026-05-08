import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        List<Integer> answer = new ArrayList<>();
        int mn = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0; i<arr.length; i++) {
            answer.add(arr[i]);
            if(mn >= arr[i]){
                mn = arr[i];
                index = i;
            }

        }
        answer.remove(index);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}