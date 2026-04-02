class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = triangle;
        dp[0][0] = triangle[0][0];
        for(int i=1; i<triangle.length;i++){
            dp[i][0] = dp[i-1][0] + triangle[i][0];
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];
        }
        for(int i=2; i<triangle.length;i++){
            for(int j=1; j<triangle[i].length-1;j++){
                int left = dp[i-1][j-1] + triangle[i][j];
                int right = dp[i-1][j] + triangle[i][j];
                dp[i][j] = Math.max(left,right);
            }
        }
        int answer = 0;
        
        for(int i=0; i<triangle[triangle.length-1].length;i++){
            answer = Math.max(answer, triangle[triangle.length-1][i]);
        }
        return answer;
    }
}