import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        sb.append((a+b)%c).append('\n');
        sb.append(((a%c) + (b%c))%c).append('\n');
        sb.append((a*b)%c).append('\n');
        sb.append(((a%c)*(b%c))%c).append ('\n');
        
        System.out.print(sb);
    }
}