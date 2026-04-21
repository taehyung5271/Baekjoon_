class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] temp = new String[n];
        String[] result = new String[n];
        StringBuilder[] sb = new StringBuilder[n];
        
        for(int i=0; i<n;i++){
            sb[i] = new StringBuilder();
        }
        
        int[] num = new int[n];
        for(int i=0; i<n;i++){
            num[i] = arr1[i] | arr2[i];
            temp[i] = Integer.toBinaryString(num[i]);
        }
        for(int i=0; i<n;i++){
            while(temp[i].length() < n)
            {
                temp[i] = "0" + temp[i];
            }
        }
        
        for(int i=0; i<n;i++){
            for(char ch: temp[i].toCharArray()){
                if(ch == '1') {
                    sb[i].append("#");
                }else {
                    sb[i].append(" ");
                }
            }
            
            result[i] = sb[i].toString();
        }
        
        return result;
    }
}

