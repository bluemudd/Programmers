package programmers;

import java.io.*;
import java.util.*;


public class twoCircle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int sum = 0;
        for(int i = 1; i<=r2 ; i++){
            long a = (int)Math.ceil(Math.sqrt(1.0*r1*r1-1.0*i*i));
            long b = (int)Math.floor(Math.sqrt(1.0*r2*r2-1.0*i*i));
            sum += (b-a)+1;
        }
        System.out.println(sum*4);
    }
}
