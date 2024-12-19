package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
import java.io.*;
public class test2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int k = 6;
        int dp [][] = new int[45][3];

        dp[0] = new int []{0, 0, 1};
        dp[1] = new int []{0, 0, 1};
        dp[2] = new int []{0, 1, 1};
        dp[3] = new int []{0, 1, 2};

        for(int i = 0; i< 3; i++){
            System.out.println("["+dp[i][0]+", "+dp[i][1]+", "+dp[i][2]+"]");
        }

//        int n = Integer.parseInt(br.readLine());

        for(int i = 4; i <=10 ; i++){
            dp[i][2] = (dp[i-1][2]+dp[i-2][2])-dp[i-4][1];
            dp[i][1] = (dp[i-1][1] + dp[i-2][1])-dp[i-4][1];
            dp[i][0] =  dp[i-1][0] + dp[i-4][1];

            System.out.println("["+dp[i][0]+", "+dp[i][1]+", "+dp[i][2]+"]");
        }
    }
}
