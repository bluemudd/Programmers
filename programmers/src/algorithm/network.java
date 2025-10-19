package algorithm;
//https://school.programmers.co.kr/learn/courses/30/lessons/86971
import java.util.*;
import java.io.*;
class network {

    static List<List<Integer>> network ;
    static boolean[] visited;
    static int count;
    static Queue<Integer> que = new LinkedList<>();
    static int min = Integer.MAX_VALUE;

    public static int solution(int n, int[][] wires) {
        network = new ArrayList<>();
        for(int i= 0; i<=n ; i++){
            network.add(new ArrayList<>());
        }

        for(int [] wire : wires){
            network.get(wire[0]).add(wire[1]);
            network.get(wire[1]).add(wire[0]);
        }

        for(int [] wire : wires){
            int a = wire[0];
            int b = wire[1];
            visited = new boolean[n+1];

            network.get(a).remove(Integer.valueOf(b));
            network.get(b).remove(Integer.valueOf(a));

            count = 0;
            bfs(a);

            min =Math.min(min, Math.abs(count - (n - count)));
            network.get(a).add(Integer.valueOf(b));
            network.get(b).add(Integer.valueOf(a));
        }


        int answer = min;
        return answer;
    }

    static void bfs(int n){

        visited[n] = true;
        que.offer(n);

        while(!que.isEmpty()){
            int start = que.poll();
            count++;
            for(int next : network.get(start)){
                if(!visited[next]){
                    visited[next] = true;
                    que.offer(next);
                }
            }
        }

    }

    static void dfs(int node) {
        visited[node] = true;
        count++;
        for (int next : network.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) {
        int [][] a = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        solution(9, a);
    }
}