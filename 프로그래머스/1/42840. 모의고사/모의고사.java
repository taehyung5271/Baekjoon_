import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2,1,2,3,2,4,2,5};
        int[] stu3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] point = new int[3];
        int max_point =0;
        for(int i=0; i<answers.length; i++){
            if(stu1[i%stu1.length] == answers[i]){
                point[0]++;
                max_point = Math.max(max_point,point[0]);
            }
            if(stu2[i%stu2.length] == answers[i]){
                point[1]++;
                max_point = Math.max(max_point,point[1]);
            }
            if(stu3[i%stu3.length] == answers[i]){
                point[2]++;
                max_point = Math.max(max_point,point[2]);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<3;i++){
            if(point[i] == max_point){
                result.add(i+1);
            }
        }
        Collections.sort(result);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}