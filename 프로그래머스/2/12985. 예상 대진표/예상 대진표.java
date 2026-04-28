class Solution
{
    public int solution(int n, int a, int b)
    {
        int mid = n / 2;
        int pow = (int)(Math.log(n) / Math.log(2));
        
        if((a <= mid && b > mid) || (a > mid && b <= mid)){
            return pow;
        }else if(a <= mid && b <= mid) {
            return solution(n/2, a, b);
        }else {
            return solution(n/2 ,a-mid , b-mid);
        }


    }
}