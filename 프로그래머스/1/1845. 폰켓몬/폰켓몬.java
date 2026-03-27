import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int choiceNum = nums.length / 2;
        for(int n : nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int kinds=0;
        for(int key : m.keySet()){
            kinds++;
        }
        //종류 갯수를 다 구했고
        //nums.length의 절반값의 선택할 수 있는 기회가 주어짐
        if(kinds == choiceNum){
            return kinds;
        }else {
            return Math.min(kinds,choiceNum);
        }
    }
}

//kinds 3  choiNum 2 2
//kinds 3  choiNum 3 3
//kinds 2  choiNum 3 2