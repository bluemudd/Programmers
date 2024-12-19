package baekjoon;

import java.util.*;
import java.io.*;

public class n2156 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] ap = new int[n+1];
        for(int i = 1; i<n+1; i++){
            ap[i] = Integer.parseInt(br.readLine());
        }

        int [][] dp = new int[n+1][3];

        for(int i = 1; i<= n; i++){
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp[i][1] = dp[i-1][0] + ap[i];
            dp[i][2] = dp[i-1][1] + ap[i];
        }
        System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));

    }
}
