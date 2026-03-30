import java.util.*;
class Solution {
    Map<String, PriorityQueue<String>> adj = new HashMap<>();
    List<String> answer = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        for(String[] ticket : tickets){
            adj.computeIfAbsent(ticket[0],k -> new PriorityQueue<>()).add(ticket[1]);
        }
        
        dfs("ICN");
        return answer.toArray(new String[0]);
    }
    
    public void dfs(String cur){
        while(adj.containsKey(cur) && !adj.get(cur).isEmpty()){
            String next = adj.get(cur).poll();
            dfs(next);
        }
        
        answer.add(0,cur);
    }
}