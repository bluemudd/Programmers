package GaeChuiTutor.swea;

import java.util.*;
import java.io.*;

public class n1859 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        long [] graph ;

        int T = Integer.parseInt(br.readLine());

        for(int test_case = 0; test_case<T; test_case++){
            int stCount = Integer.parseInt(br.readLine());
            st= new StringTokenizer(br.readLine());

            graph = new long[stCount];
            for(int i = 0; i<stCount; i++){
                graph[i] = Long.parseLong(st.nextToken());
            }
            bw.write("#"+(test_case+1)+" "+calculate(graph)+"\n");
        }
        bw.flush();

    }

    public static long calculate(long[] graph){
        int hi_price = graph.length-1;
        int now_price = graph.length-2;
        long sum = 0;
        while(now_price>=0){
            if(graph[now_price]>= graph[hi_price]){
                hi_price = now_price;
                now_price = hi_price-1;
            }
            else{
                sum += graph[hi_price]-graph[now_price];
                now_price--;
            }
        }
        return sum;

    }
}
