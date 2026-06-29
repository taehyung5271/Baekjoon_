class Solution {
    public int solution(int[] array) {
        int[] num = new int[1000];
        for(int i=0; i<array.length; i++){
            num[array[i]]++;
        }
        int maxCount = 0;
        int answer = 0;
        boolean isFlag = false;
        for(int i=0; i<num.length;i++){
            if(num[i]>maxCount){
                maxCount = num[i];
                answer = i;
                isFlag= false;
            }else if(num[i] == maxCount && maxCount > 0) {
                isFlag = true;
            }
        }
        return isFlag ? -1 : answer;
    }
}