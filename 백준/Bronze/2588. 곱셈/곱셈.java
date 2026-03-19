import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        sb.append(a * (b %10)).append('\n');
        sb.append(a * ((b % 100)/10)).append('\n');
        sb.append(a * (b / 100)).append('\n');
        sb.append(a * b).append('\n');
        System.out.println(sb);
    }
}