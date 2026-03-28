import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        //Map<String,Integer> m = new HashMap<>();
        //key에는 장르명, value에는 sum을 계속 집어넣어주면서
        //장르별로 priorityqueue를 만들어서 최대값 두개만 빼줄까?
        Map<String, Integer> genrePlaySum = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();
        for(int i=0; i<plays.length; i++){
            String g = genres[i];
            int p = plays[i];
            genrePlaySum.put(g,genrePlaySum.getOrDefault(g,0)+p);
            
            genreSongs.putIfAbsent(g,new ArrayList<>());
            genreSongs.get(g).add(new int[]{i,p});
        }
        
        List<String> keySet = new ArrayList<>(genrePlaySum.keySet());
        
        keySet.sort((a,b) -> genrePlaySum.get(b).compareTo(genrePlaySum.get(a)));
        
        List<Integer> answer = new ArrayList<>();

        for(String key : keySet){
            //여기서 재생수 내림차순 -> 재생수같으면 id 오름 차순
            List<int[]> songs = genreSongs.get(key);
            
            songs.sort((a,b) -> {
                if( a[1] == b[1]) return a[0] - b[0]; //오른차순
                return b[1] - a[1];
            });
            
            for(int i=0; i<songs.size() && i<2;i++){
                answer.add(songs.get(i)[0]);
            }
                
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
        //answer.stream().mapToInt(i -> i).toArray()
    }
}