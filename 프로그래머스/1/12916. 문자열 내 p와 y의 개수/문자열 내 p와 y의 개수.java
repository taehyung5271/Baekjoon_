class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_num = 0;
        int y_num = 0;
        
        for (char ch : s.toCharArray()) {
            if(Character.toUpperCase(ch) == 'P') {
                p_num += 1;
            }else if(Character.toUpperCase(ch) == 'Y') {
                y_num += 1;
            }
        }
        
        return p_num == y_num ? true : false;
    }
}