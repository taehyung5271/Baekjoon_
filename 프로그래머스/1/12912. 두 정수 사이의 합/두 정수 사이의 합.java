class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int left = a <= b ? a : b;
        int right = a > b ? a : b;
        for(int i = left; i <= right; i++){
            answer += i;
        }
        return answer;
    }
}