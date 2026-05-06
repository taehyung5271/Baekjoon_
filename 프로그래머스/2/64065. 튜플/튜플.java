import java.util.*;
class Solution {
    public int[] solution(String s) {
        String temp = s.replaceAll("\\},\\{", "/");
        String cleaned = temp.replaceAll("\\{","").replaceAll("\\}","");
        String[] strs = cleaned.split("/");
        Arrays.sort(strs, (o1,o2) -> o1.length() - o2.length());
        Set<Integer> set = new HashSet<>();
        List<Integer> arr = new ArrayList<>();
        int first = Integer.parseInt(strs[0]);
        set.add(first);
        arr.add(first);
        for(int i=1; i<strs.length;i++){
            String[] numbersStr = strs[i].split(",");
            
            for(String str : numbersStr){
                int input = Integer.parseInt(str);
                if(set.contains(input)){
                    continue;
                } else {
                    set.add(input);
                    arr.add(input);
                }
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}