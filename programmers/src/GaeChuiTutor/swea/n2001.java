package GaeChuiTutor.swea;

import java.util.*;
import java.io.*;



public class n2001 {
    static int maxVal;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if(N<5 || N>15 || C <2 || C >N){
                break;
            }
            maxVal = Integer.MIN_VALUE;
            int [][] fly = new int[N][N];
            for(int i = 0 ; i<N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    fly[i][j]= Integer.parseInt(st.nextToken());
                }
            }
            for(int k = 0; k<N-C+1; k++){
                for(int l = 0; l<N-C+1; l++){
                    maxVal=Math.max(maxVal,sum(fly, l, k, C));
                }
            }
            bw.write("#"+test_case+" "+maxVal+"\n");
        }
        bw.flush();

    }
    private static int sum(int[][] fly, int x, int y, int C){
        int sum = 0;
        for(int i = 0; i<C; i++){
            for(int j = 0; j< C; j++){
                sum += fly[y+i][x+j];
            }
        }
        return sum;
    }
    private static void printArray(int [][] square){
        for(int i = 0; i < square.length; i++){
            for(int j = 0; j< square[i].length; j++){
                System.out.print(square[i][j]+" ");
            }
            System.out.println();
        }
    }
}
