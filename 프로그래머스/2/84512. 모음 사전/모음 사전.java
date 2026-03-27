class Solution {
    char[] vowels = {'A','E','I','O','U'};
    int count = 0;
    int answer = 0;
    boolean found = false;
    
    public int solution(String word) {
        //모음사전을 전부 구성을 해야하나
        //아니면 word를 받고 그녀석을 dfs돌려서 몇번째인지 확인해야하나
        dfs("",word);
        return answer;
    }
    public void dfs(String current, String target){
        if(current.equals(target)){
            answer = count;
            found = true;
            return;
        }
        
        if(current.length() == 5) return;
        for(int i=0; i<5; i++){
            if(found) return;
            
            count++;
            dfs(current + vowels[i], target);
        }
    }
}


//A    , AA   , AAA  , AAAA, AAAAA, AAAAE, AAAAI, AAAAO, AAAAU 백트래킹인가?
//AAAE , AAAEA, AAAEE, AAAEI, AAAEO, AAAEU, AAAI 

//char[] vowel = {'A','E','I','O','U'};