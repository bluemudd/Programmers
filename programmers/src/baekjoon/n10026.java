package baekjoon;

import java.util.*;
import java.io.*;

public class n10026 {

    static int [] mx = {1, -1, 0, 0};
    static int [] my = {0, 0, -1, 1};
    static char [][] Map;
    static boolean [][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Map = new char[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i<N; i++){
            String line = br.readLine();
            for(int j = 0; j<N; j++){
                Map[i][j] = line.charAt(j);
            }
        }
        int count = 0;
        for(int p = 0; p<N; p++){
            for(int t = 0 ; t<N; t++){
                if(!visited[p][t]){
                    bfs(p,t, false);
                    count++;
                }
            }
        }
        bw.write(count+" ");
        count = 0;
        visited = new boolean[N][N];
        for(int p = 0; p<N; p++){
            for(int t = 0 ; t<N; t++){
                if(!visited[p][t]){
                    bfs(p,t, true);
                    count++;
                }
            }
        }
        bw.write(count+"\n");

        bw.flush();

    }

    static void bfs(int i, int j, boolean RG){
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{i, j});
//        int count = 1;
        char key = Map[i][j];
//        System.out.println(key);
        while(!q.isEmpty()){
            int [] f = q.poll();
//            count++;

            for(int m = 0; m<4; m++){
                int nx = f[0]+mx[m];
                int ny = f[1]+my[m];
                if(nx <Map.length && nx >= 0 && ny < Map.length && ny >=0){
                    if(!RG && !visited[nx][ny] && Map[nx][ny] == key){
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});

                    }
                    else if(RG && !visited[nx][ny]){
                        if(key == 'R' || key == 'G'){
                            if(Map[nx][ny] == 'R' || Map[nx][ny] == 'G'){
                                visited[nx][ny] = true;
                                q.add(new int[]{nx, ny});
                            }
                        }
                        else if(Map[nx][ny] == key){
                            visited[nx][ny] = true;
                            q.add(new int[]{nx, ny});
                        }
                    }
                }
            }
        }
    }
}
