class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String pur = String.valueOf(a) + String.valueOf(b);
        String rev = String.valueOf(b) + String.valueOf(a);
        
        answer = Math.max(Integer.parseInt(pur),Integer.parseInt(rev));
        return answer;
    }
}