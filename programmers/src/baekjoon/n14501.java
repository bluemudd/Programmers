package baekjoon;

import java.util.*;
import java.io.*;

public class n14501 {
    static int [][] ep;
    static int [][] dp;
    static int N;
    static int result;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st ;


        ep = new int[N+1][2];
        dp = new int[N+1][2];

        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            ep[i][0] = Integer.parseInt(st.nextToken());
            ep[i][1] = Integer.parseInt(st.nextToken());
        }
        result = 0;
        recursion(0, 0);
        System.out.println(result);

    }

    public static void recursion(int t, int p){

        if(t >= N){
            result = Math.max(p, result);
            return;
        }

        if(t + ep[t][0] <= N){
            recursion(t+ep[t][0], p+ep[t][1]);
        }
        else{
            recursion(t+ep[t][0], p);
        }

        recursion(t+1, p);

    }
}
