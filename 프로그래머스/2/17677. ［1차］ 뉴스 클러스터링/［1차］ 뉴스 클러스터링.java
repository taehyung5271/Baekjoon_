import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        Map<String,Integer> a = new HashMap<>();
        Map<String,Integer> b = new HashMap<>();
        for(int i=0; i<=str1.length()-2;i++){
            String temp = str1.substring(i,i+2);
            temp = temp.replaceAll("[^a-zA-Z]","");
            if(temp.length() != 2) continue;
            a.put(temp,a.getOrDefault(temp,0)+1);
        }
        for(int i=0; i<=str2.length()-2;i++){
            String temp = str2.substring(i,i+2);
            temp = temp.replaceAll("[^a-zA-Z]","");
            if(temp.length() != 2) continue;
            b.put(temp,b.getOrDefault(temp,0)+1);
        }
        int gyo = 0;
        int hap = 0;
        for(String key : a.keySet()){
            if(b.containsKey(key)) {
                gyo += Math.min(a.get(key),b.get(key));
            }
        }
        
        for(String key : a.keySet()) {
            hap += a.get(key);
        }
        for(String key : b.keySet()) {
            hap += b.get(key);
        }
        hap -= gyo;

        
        
        if(a.size() == 0 && b.size() == 0) return 65536;
        double answer = (double)gyo / hap * 65536 ;
        
        return (int)answer;
    }
}