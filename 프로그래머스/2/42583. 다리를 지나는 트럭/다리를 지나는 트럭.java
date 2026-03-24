import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int n = truck_weights.length;
        int possible_weight = weight;
        int time = 0;
        //다리에 오를 수 있는 트럭: bridge_length대
        //다리: weight 이하까지
        //트럭들의 무게 배열
        Deque<Integer> passingQ = new ArrayDeque<>();
        for(int i=0; i < bridge_length; i++){
            passingQ.offer(0);// 우선 bridge_length만큼 q에 집어넣음
        }
        
        List<Integer> passed = new ArrayList<>();
        int i =0;
        while(true){
            //passed한 트럭의 갯수가 대기 트럭과 동일하면 탈출
            if(passed.size() == n) return time;
            //passingQ 제일 앞이 0이면 그냥 빼
            if(passingQ.peek() == 0) {
                passingQ.poll();
            }else {
                possible_weight += passingQ.peek();//제일 앞이 0이 아니니 트럭은 빠져나오고 가능한 무게 다시 증가
                passed.add(passingQ.poll());//제일 앞이 0이 아니면 passedQueue에 집어넣어라
            }
            if(i >= n) {
                passingQ.offer(0);    
            }else{
                if(possible_weight >= truck_weights[i]){
                    passingQ.offer(truck_weights[i]);
                    possible_weight -= truck_weights[i];
                    i++;
                } else {
                    passingQ.offer(0);
                }    
            }
            
            time++;
        }
    }
}