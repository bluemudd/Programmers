package GaeChuiTutor.dfs;

import java.io.*;
import java.util.*;

public class n2606 {
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        ArrayList<Integer> [] computerList = new ArrayList[computer+1];
        for(int i =0; i<computerList.length; i++){
            computerList[i] = new ArrayList<>();
        }
        visited = new boolean[computer+1];
        int connectCount = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<connectCount; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            computerList[from].add(to);
            computerList[to].add(from);
        }
        dfs(1, computerList);
        int count = 0;
        for (boolean b : visited) {
            if (b) {
                count++;
            }
        }
        System.out.println(count-1);
    }
    public static void dfs(int start, ArrayList<Integer> [] computerList){
        visited[start] = true;
        for(int i=0; i<computerList[start].size(); i++){
            if(!visited[computerList[start].get(i)]){
                dfs(computerList[start].get(i), computerList);
            }

        }

    }
}
