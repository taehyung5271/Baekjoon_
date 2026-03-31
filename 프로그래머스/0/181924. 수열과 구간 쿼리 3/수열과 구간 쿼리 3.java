class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        
        for(int[] query : queries){
            int leftIdx = query[0];
            int rightIdx = query[1];
            int temp = answer[leftIdx];
            answer[leftIdx] = answer[rightIdx];
            answer[rightIdx] = temp;
        }
        
        return answer;
    }
}