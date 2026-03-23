import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] strNumbers = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        //String으로 내림차순 "6">"10"이기에
        Arrays.sort(strNumbers, (a,b) -> (b + a).compareTo(a+b));
        
        //내림차순으로 정리된 애들인데 0이 제일 앞에 올경우 전부 
        if(strNumbers[0].equals("0")) return "0";
        
        for(int i=0; i<numbers.length;i++){
            sb.append(strNumbers[i]);
        }
        return String.valueOf(sb);

    }
}