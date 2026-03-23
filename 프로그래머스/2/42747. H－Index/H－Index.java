import java.util.*;

class Solution {
    public int solution(int[] citations) {
        //1<=n<=1000, 0<=h<=10000
        int n = citations.length;
        //h는 citations를 오름차순 정렬 후 정중앙값?
        //중앙부터 h를 찾아나서는데 pointer로 찾아가야하나?
        Arrays.sort(citations);
        
        for(int i=0; i<n;i++){
            //현재 논문의 인용 횟수: citations[i]
            //이 논문 보다 많이 인용된 논문 수(자신 포함) n-i
            int h = n-i;
                
                if(citations[i] >= h){
                    //조건을 만족하는 첫번째 순간이 곧 최대 H-index
                    return h;
                }
        }
        
        return 0;
    }
}