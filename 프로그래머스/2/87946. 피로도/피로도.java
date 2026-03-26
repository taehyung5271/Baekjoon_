class Solution {
    int answer = 0;
    boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        perm(k,0,dungeons);
        
        return answer;
    }
    
    public void perm(int curK, int count, int[][] dungeons){
        answer = Math.max(answer,count);
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= curK){
                visited[i] = true;
                perm(curK-dungeons[i][1],count + 1, dungeons);
                visited[i] = false;
            }
        }
    }
}