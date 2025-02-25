package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [][] map = new int[101][101];
        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st=new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j<x+10; j++){
                for(int p = y; p<y+10; p++){
                    map[p][j] = 1;
                }
            }
        }
        int count = 0;
        for(int i = 1; i< 101; i++){
            for(int j = 1; j< 101; j++){
                if(map[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
