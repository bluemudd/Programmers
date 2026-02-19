package baekjoon;

import java.io.*;
import java.util.*;
//https://innovation123.tistory.com/71
//https://www.acmicpc.net/problem/1260

public class n1260 {
    static boolean [] visited;
    static List<Integer>[] map;
    static String procedureDfs;
    static String procedureBfs;
    static Queue<Integer> q;

    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        map = new ArrayList[N+1];
        visited = new boolean[N+1];
        q = new LinkedList<Integer>();

        for(int i=0; i<=N; i++){
            map[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            String[] mapInput = br.readLine().split(" ");
            map[Integer.parseInt(mapInput[0])].add(Integer.parseInt(mapInput[1]));
            map[Integer.parseInt(mapInput[1])].add(Integer.parseInt(mapInput[0]));
        }

        for(int i =0; i<=M; i++){
            Collections.sort(map[i]);
        }

        stackDfs(V);
        visited = new boolean[N+1];
        bfs(V);

        System.out.println(procedureDfs);
        System.out.println(procedureBfs);
    }
    public static void dfs(int V){
        if(visited[V]) return;

        visited[V] = true;
        procedureDfs += V+" ";

        for(int next : map[V]){
            if(!visited[next]) dfs(next);
        }
    }
    public static void bfs(int V){
        q.offer(V);
        visited[V] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            procedureBfs += V+" ";

            for(int next : map[cur]){
                if (!visited[next]){
                    q.offer(next);
                    visited[next] = true;
                    procedureBfs += next+" ";
                }
            }
        }
    }

    public static void stackDfs(int V){
        Stack<Integer> stack = new Stack<>();
        stack.push(V);
        visited[V] = true;

        while(!stack.isEmpty()){
            int next = stack.pop();
            procedureDfs += next+" ";

            for(int m : map[next]){
                if(!visited[m]) {
                    stack.push(m);
                    visited[m] = true;
                }
            }
        }
    }
}
