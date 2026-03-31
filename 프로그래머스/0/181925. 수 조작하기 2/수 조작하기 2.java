class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int prev = numLog[0];
        for(int i=1;i<numLog.length;i++){
            int cur = numLog[i] - prev;
            if(cur == 1){
                answer += "w";
            }else if(cur == -1){
                answer += "s";
            }else if(cur == 10){
                answer += "d";
            }else if(cur == -10){
                answer += "a";
            }
            prev = numLog[i];
        }
        return answer;
    }
}