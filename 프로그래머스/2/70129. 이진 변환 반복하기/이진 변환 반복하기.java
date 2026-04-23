class Solution {
    public int[] solution(String s) {
        int doBinary = 0;
        int minusZero = 0;
        
        while(!(s.equals("1"))){
            doBinary += 1;
            int countOne =0;
            for(int i=0; i<s.length();i++){
                if(s.charAt(i) == '0'){
                    minusZero +=1;
                }else {
                    countOne += 1;
                }
            }
            s = Integer.toBinaryString(countOne);;
        }
        
        
        int[] answer = {doBinary,minusZero};
        return answer;
    }
}