import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        //a배열중 하나와 b배열중 하나를 뽑아 곱하는데
        //값을 누적합한다
        //이때 누적합이 최소값이 되는 값은?
        //곱셈
        Arrays.sort(A);
        Arrays.sort(B);
        int[] rev = new int[B.length];
        for(int i=0; i<B.length; i++){
            rev[i] = B[B.length-i-1];
        }
        for(int i=0; i<A.length;i++){
            answer += (A[i] * rev[i]);
        }
        
        return answer;
    }
}