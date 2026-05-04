class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int n = numbers.length;
        for ( int i=0; i<n; i++) {
            answer += numbers[i];
        }
        answer /= n;
        return answer;
    }
}