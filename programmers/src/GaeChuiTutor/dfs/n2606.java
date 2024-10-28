package GaeChuiTutor.dfs;

import java.io.*;
import java.util.*;

public class n2606 {
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        boolean [][] computerList = new boolean[computer][computer];
        visited = new boolean[computer];
        int connectCount = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<connectCount; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            computerList[from-1][to-1] = true;
        }
        dfs(1, computerList);
        int count = 0;
        for(int i =0; i<visited.length; i++){
            if(visited[i]==true){
                count++;
            }
        }
        System.out.println(count-1);
    }
    public static void dfs(int start, boolean[][] list){
        visited[start-1] = true;
        for(int i=0; i<list.length; i++){
            if(list[start-1][i]){
                dfs(i+1, list);
            }
        }

    }
}
