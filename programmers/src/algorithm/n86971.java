package algorithm;

import java.util.*;
import java.io.*;

class n86971 {
    ArrayList<ArrayList<Integer>> map;
    boolean[] visited;


    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        for(int j = 0; j<wires.length; j++){
            map = new ArrayList<>();
            for(int t = 0; t< n+1; t++){
                map.add(new ArrayList<>());
            }
            for(int i = 0; i<wires.length; i++){
                if(j == i){
                    continue;
                }
                map.get(wires[i][0]).add(wires[i][1]);
                map.get(wires[i][1]).add(wires[i][0]);
            }
            int max = Integer.MIN_VALUE;
            for(int a = 1; a<n+1; a++){
                visited = new boolean[n+1];
                max = Math.max(max,bfs(a));
            }
            if(answer > Math.abs(max-((wires.length-1)-max))){
                answer = Math.abs(max-((wires.length-1)-max));
            }

        }


        return answer;
    }

    public int bfs(int start){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(start);
        visited[start]=true;
        int count = 0;
        while(!q.isEmpty()){
            int next = q.poll();
            for(int i = 0; i<map.get(next).size(); i++){
                if(!visited[map.get(next).get(i)]){
                    q.offer(map.get(next).get(i));
                    visited[map.get(next).get(i)] = true;
                    count++;
                }
            }

        }
        return count;

    }
}
