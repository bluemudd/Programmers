package baekjoon;

import java.io.*;
import java.util.*;

public class n2606 {

    static boolean visited[];
    static List<Integer> [] virusMap;
    static int virusCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int M = Integer.parseInt(br.readLine()); // 컴퓨터 연결 네트워크 쌍의 수

        visited = new boolean[N+1];
        virusMap = new ArrayList[N+1];

        for(int j = 0; j < virusMap.length ; j++){
            virusMap[j] = new ArrayList<>();
        }

        for(int i = 0; i<M; i++){
            String[] inputMap = br.readLine().split(" ");
            virusMap[Integer.parseInt(inputMap[0])].add(Integer.parseInt(inputMap[1]));
            virusMap[Integer.parseInt(inputMap[1])].add(Integer.parseInt(inputMap[0]));
        }

        dfs(1);
        System.out.println(virusCount-1);
    }

    public static void dfs(int i){
        Stack<Integer> stack = new Stack<>();
        stack.push(i);
        visited[i] = true;

        while(!stack.isEmpty()){
            int next = stack.pop();
            virusCount++;

            for(int n : virusMap[next]){
                if(!visited[n]){
                    stack.push(n);
                    visited[n] = true;
                }
            }

        }
    }
}
