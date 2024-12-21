package baekjoon;

import java.util.*;
import java.io.*;

public class n10844 {
    static long dp[][];

    final static long MOD = 1000000000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new long[N+1][10];

        for(int i = 0; i<10; i++){
            dp[1][i] = 1L;
        }
        long result = 0;
        for(int i =1; i<= 9; i++){
            result += recur(N, i);
        }
        System.out.println(result% MOD);



    }

    static long recur(int degree, int val){
        if(degree == 1){
            return dp[degree][val];
        }

        if(dp[degree][val] == 0L){
            if(val == 0){
                dp[degree][val] = recur(degree -1, 1);
            }

            else if(val == 9){
                dp[degree][val] = recur(degree-1, 8);
            }
            else{
                dp[degree][val] = recur(degree -1, val-1)+recur(degree-1, val+1);
            }
        }
        return dp[degree][val] % MOD;
    }
}
