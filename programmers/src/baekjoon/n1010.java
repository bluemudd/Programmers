package baekjoon;

import java.util.*;
import java.io.*;



public class n1010 {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i< T; i++){
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            bw.write(combi(N, R)+"\n");
        }
        bw.flush();


    }
    static int combi(int n, int r){
        if(dp[n][r] > 0){
            return dp[n][r];
        }

        if(n == r || r == 0){
            return dp[n][r]=1;
        }

        return dp[n][r] = combi(n-1, r-1)+ combi(n-1, r);
    }
}
