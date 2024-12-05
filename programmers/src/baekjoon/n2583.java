package baekjoon;

import java.util.*;
import java.io.*;

public class n2583 {

    static int [][] map;

    static int [] mx = {-1, 1, 0, 0};
    static int [] my = {0, 0, -1, 1};

    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int M, N, K;
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[M][N];

        for(int i = 0; i< K; i++){
             st = new StringTokenizer(br.readLine());
             int x1 = Integer.parseInt(st.nextToken());
             int y1 = Integer.parseInt(st.nextToken());

             int x2 = Integer.parseInt(st.nextToken())-1;
             int y2 = Integer.parseInt(st.nextToken())-1;

             for(int j = x1; j<=x2; j++){
                 for(int p = y1; p<=y2; p++){
                     if(map[p][j] != 1){
                         map[p][j]= 1;
                     }
                 }
             }

        }
        ArrayList<Integer> ar = new ArrayList<>();
        for(int q = 0; q< map.length; q++){
            for(int z = 0; z<map[q].length; z++){
                if(map[q][z] == 0){
                    count = 0;
                    dfs(z, q);
                    ar.add(count);
                }
            }
        }
        Collections.sort(ar);
        System.out.println(ar.size());
        for(int i = 0; i<ar.size(); i++){
            System.out.print(ar.get(i)+" ");
        }
    }
    public static void dfs(int x, int y){
        map[y][x] = 1;
        count++;
        for(int i = 0; i<mx.length; i++){
            int nx = x+mx[i];
            int ny = y+my[i];
            if((nx >= 0 && nx < map[0].length) && (ny>= 0 && ny < map.length)){
                if(map[ny][nx] == 0){
                    dfs(nx, ny);
                }
            }
        }
    }
}
