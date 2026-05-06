class Solution {
    public int solution(int num) {
        int count = 0;
        if(num == 1) return 0;
        while(num != 1 && count <= 500) {
            if(num % 2 == 0) {
                num /= 2;
            }else {
                num = 3*num + 1;
            }
            count++;
            if(num < 0) return -1;
        }
        if(count >= 500) {
            return -1;
        } else {
            return count;
        }
        
    }
}