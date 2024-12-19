package baekjoon;
import java.util.*;
import java.io.*;


public class n9461 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_case = Integer.parseInt(br.readLine());
        for(int i = 0; i<test_case; i++){
            int N = Integer.parseInt(br.readLine());
            long [] dp = new long[101];

            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;
            dp[6] = 3;
            dp[7] = 4;
            dp[8] = 5;
            dp[9] = 7;
            dp[10] = 9;
            if(N< 11){
                bw.write(dp[N]+"\n");
            }
            else{
                for(int j = 11; j<=N; j++){
                    dp[j] = dp[j-1] + dp[j-5];
//                    System.out.println(dp[j]);
                }
                bw.write(dp[N]+"\n");
            }
        }
        bw.flush();



    }
}
