import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        //"uid" : "nickname"
        Map<String,String> id_nickname = new HashMap<>();
        //{command, id}
        List<String[]> res = new ArrayList<>();// 결과값
        List<String> answer = new ArrayList<>(); //결과 출력값
        
        
        for(String str: record) { // 레코드배열 중 str을 쪼개서 커맨드로 관리해야겠다.
            
            String[] command = str.split(" ");
            
            if(command[0].equals("Enter")){ // 들어올때마다 res에 추가해줘야겠다
                id_nickname.put(command[1],command[2]);
                res.add(new String[]{command[0],command[1]});
            }else if(command[0].equals("Leave")){ // 들어올때마다 res에 추가해줘야겠다.
                res.add(new String[]{command[0],command[1]});
            }else if(command[0].equals("Change")){ // 들어올때마다 res를 수정 
                id_nickname.put(command[1],command[2]);
            }
        }
        for(String[] str: res){
            if(str[0].equals("Enter")){
                answer.add(id_nickname.get(str[1])+"님이 들어왔습니다.");
            }else{
                answer.add(id_nickname.get(str[1])+"님이 나갔습니다.");
            }
        }
        
        return answer.toArray(new String[0]);
    }
}