class Solution {
    public int solution(int n) {
        int result = n;
        int binary_int = 0; //n의 1의 갯수
        String binary_str = Integer.toBinaryString(n); // n을 2진수화한 문자열
        for(int i=0; i<binary_str.length(); i++){
            if(binary_str.charAt(i)=='1'){
                binary_int += 1;
            }
        }
        while(true){
            result++;
            int res_binary_int = 0;
            String res_binary_str = Integer.toBinaryString(result);
            for(int i=0; i<res_binary_str.length(); i++){
                if(res_binary_str.charAt(i)=='1'){
                    res_binary_int += 1;
                }
            }
            if(res_binary_int == binary_int){
                return result;
            }
        }
        
    }
}