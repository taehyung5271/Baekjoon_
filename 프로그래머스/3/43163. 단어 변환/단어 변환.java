class Solution {
    boolean canChange(String a, String b){
        int diff = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)) diff++;
        }
        if(diff > 1) return false;
        
        return diff == 1;
    }
    int dfs(String cur, String target, String[] words, boolean[] visited, int depth){
        if(cur.equals(target)) return depth;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<words.length; i++){
            if(!visited[i] && canChange(cur,words[i])){
                visited[i] = true;
                min = Math.min(min,dfs(words[i],target,words,visited,depth+1));
                visited[i] = false;
            }
        }
        return min;
        
    }
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        
        int answer = dfs(begin,target,words,visited,0);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}