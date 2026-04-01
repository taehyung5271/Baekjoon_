class Solution {
    public int solution(int[] money) {
        int answer = 0;
        int[] dp1 = new int[money.length];
        int[] dp2 = new int[money.length];
        dp1[0] = money[0];
        dp1[1] = money[0];
        
        dp2[0] = 0;
        dp2[1] = money[1];
        
        for(int i=2; i<money.length-1; i++){
            dp1[i] = Math.max(dp1[i-2]+money[i],dp1[i-1]);
        }
        for(int i=2; i<money.length; i++){
            dp2[i] = Math.max(dp2[i-2]+money[i],dp2[i-1]);
        }
        
        answer = Math.max(dp2[money.length-1],dp1[money.length-2]);
        
            
        return answer;
    }
}

















































// if(money.length == 3){
        //     for(int i=0; i<money.length;i++){
        //         answer = Math.max(money[i],answer);    
        //     }           
        // }
        // else if(money.length == 4){
        //     int evenSum = money[0] + money[2];
        //     int oddSum = money[1] + money[3];
        //     answer = Math.max(evenSum,oddSum);
        // }
        // else if(money.length >=5){
        //     for(int i=0;i<money.length;i++){
        //         answer += money[i];
        //     }
        // }
        