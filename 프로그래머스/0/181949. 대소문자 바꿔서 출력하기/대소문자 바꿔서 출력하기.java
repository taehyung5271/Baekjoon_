import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char ch : a.toCharArray()){
            if('a'<= ch && ch <= 'z'){
                sb.append(Character.toUpperCase(ch));
            }else if('A' <= ch && ch <= 'Z'){
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
    }
}