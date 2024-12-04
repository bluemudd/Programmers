package baekjoon;

import java.util.*;
import java.io.*;

public class n1541 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int sum = 0;
        int count =1;
        while(st.hasMoreTokens()){
            StringTokenizer st2;
            int temp = 0;
            st2 = new StringTokenizer(st.nextToken(), "+");
            while(st2.hasMoreTokens()){
                temp += Integer.parseInt(st2.nextToken());
            }
            if(count == 1){
                sum+= temp;
            }
            else{
                sum -= temp;
            }
            count++;
        }
        System.out.println(sum);
    }
}
