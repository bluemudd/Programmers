package baekjoon;

import java.util.*;
import java.io.*;
public class n9095 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_case = Integer.parseInt(br.readLine());

        for(int t = 0; t<test_case; t++){
            int N = Integer.parseInt(br.readLine());

            int[] dp = new int[N+1];

            for(int i = 1; i<=N; i++){
                if(i==1){
                    dp[i] = 1;
                }
                else if(i==2){
                    dp[i] = 2;
                }
                else if(i==3){
                    dp[i] = 4;
                }
                else{
                    dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
                }
            }
            bw.write(dp[N]+"\n");
        }
        bw.flush();

    }
}
