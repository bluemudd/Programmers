package GaeChuiTutor.dfs;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class swea7465 {
    static boolean[] visited;
    static ArrayList<Integer> [] relationship;
    static int count;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int T;
            T=Integer.parseInt(br.readLine());



            int person;
            int relation;
            StringTokenizer st;
            for(int test_case = 1; test_case <= T; test_case++)
            {
                st = new StringTokenizer(br.readLine());
                person = Integer.parseInt(st.nextToken());
                relation = Integer.parseInt(st.nextToken());
                visited = new boolean[person];
                relationship = new ArrayList[person];
                count = 0;
                for(int i =0; i<person ; i++){
                    relationship[i] = new ArrayList<>();
                }
                for(int k =0; k< relation; k++){
                    st = new StringTokenizer(br.readLine());
                    int from = Integer.parseInt(st.nextToken());
                    int to = Integer.parseInt(st.nextToken());
                    relationship[from-1].add(to-1);
                    relationship[to-1].add(from-1);
                }
                for(int j = 0; j < person; j++){
                    if(!visited[j]){
                        count++;
                        dfs(j);
                    }
                }
                bw.write("#"+test_case+" "+count+"\n");
            }
            bw.flush();
    }

    public static void dfs(int person){
        visited[person] = true;
        for(int i=0; i <relationship[person].size(); i++){
            if(!visited[relationship[person].get(i)]){
                dfs(relationship[person].get(i));
            }
        }
    }
}
