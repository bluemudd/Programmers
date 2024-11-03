package GaeChuiTutor.dfs;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.*;
import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class n2814
{
    static Stack<Integer> stack;
    static boolean [] visited;
    static int longCount = 0;
    static ArrayList<Integer> [] path ;
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            path = new ArrayList [N];
            for(int i =0; i<N; i++){
                path[i] = new ArrayList();
            }
            visited = new boolean[N];
            for(int i =0; i< M ; i++){
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                path[from-1].add(to-1);
                path[to-1].add(from-1);
            }

            stack = new Stack<Integer>();
            int pathCount= 0;
            dfs(0, pathCount);
            bw.write("#"+test_case+" "+longCount+"\n");
        }
        bw.flush();
    }
    public static void dfs(int start,  int pathCount){
        visited[start] = true;
        stack.push(start);
        pathCount++;
        if(longCount < pathCount){
            longCount = pathCount;
        }

        while(!stack.isEmpty()){
            int go = stack.pop();
            for(int i = 0; i< path[go].size(); i++){
                if(!visited[path[go].get(i)]){
                    stack.push(path[go].get(i));
                    dfs(path[go].get(i),pathCount);
                }
            }
        }
    }
}