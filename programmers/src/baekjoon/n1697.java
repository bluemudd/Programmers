package baekjoon;

import java.util.*;
import java.io.*;

public class n1697 {
    public static int K;
    public static int N;

    public static int [] visited = new int[10001];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs(N);

    }
    public static void bfs(int n){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(n);
        visited[n] = 1;

        while(!q.isEmpty()){
            int Nn = q.poll();

            if(Nn == K){
                System.out.println(visited[Nn]-1);
                break;
            }

            if(Nn-1 >= 0 && (visited[Nn-1] == 0)){
                q.add(Nn-1);
                visited[Nn-1] = visited[Nn]+1;
            }
            if(Nn+1 < visited.length && (visited[Nn+1] == 0)){
                q.add(Nn+1);
                visited[Nn+1] = visited[Nn]+1;
            }
            if(Nn*2 < visited.length && (visited[Nn*2] == 0)){
                q.add(Nn*2);
                visited[Nn*2] = visited[Nn]+1;
            }
        }
    }
}
