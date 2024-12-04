package baekjoon;

import java.util.*;
import java.io.*;

public class n11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] coins;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        coins = new int[N];
        int spend = 0;

        for(int i = 0; i<N; i++){
            coins[i] = Integer.parseInt(br.readLine());
//            System.out.println(coins[i]);
        }

        for(int i = coins.length-1; i > -1 ; i--){
            if(K/coins[i] >0){
                spend += K/coins[i];
                K = K%coins[i];

            }
        }
        System.out.println(spend);



    }
}
