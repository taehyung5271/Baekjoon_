class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sumPow =0;
        int allMul = 1;
        for(int i=0; i<num_list.length;i++){
            allMul *= num_list[i];
            sumPow += num_list[i];
        }
        sumPow *= sumPow;
        if(allMul < sumPow) answer = 1;
        return answer;
    }
}