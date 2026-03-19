import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int a = Integer.parseInt(br.readLine());
        if(a >= 90){
            sb.append('A');
        }else if (a >=80){
            sb.append('B');
        }else if (a >= 70){
            sb.append('C');
        }else if (a >= 60){
            sb.append('D');
        }else {
            sb.append('F');
        }
        System.out.println(sb);
    }
}