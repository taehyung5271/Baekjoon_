class Solution {
    public String solution(String s) {

        String answer = "";
        
        String[] arr = s.split(" ");
        
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(String a : arr){
            mx = Math.max(mx,Integer.parseInt(a));
            mn = Math.min(mn,Integer.parseInt(a));
        }
        answer += String.valueOf(mn) +" "+ String.valueOf(mx);
        return answer;
    }
}