class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String pur = String.valueOf(a) + String.valueOf(b);
        answer = Math.max(Integer.parseInt(pur),2*a*b);
        return answer;
    }
}