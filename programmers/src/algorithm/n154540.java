package algorithm;

import java.util.*;
import java.io.*;


class n154540 {
    static int [] mx = {-1, 1, 0, 0};
    static int [] my = {0, 0, -1, 1};
    static boolean [][] visited;
    static int[][] newMaps ;
    static List<Integer> maxMap = new ArrayList<Integer>();

    public int[] solution(String[] maps) {
        visited = new boolean [maps.length][maps[0].length()];
        newMaps = new int[maps.length][maps[0].length()];
        for(int y = 0; y<maps.length; y++){
            for(int x = 0; x<maps[y].length(); x++){
                if(maps[y].charAt(x)=='X'){
                    newMaps[y][x] = 0;
                }
                else{
                    newMaps[y][x] = Integer.parseInt(String.valueOf(maps[y].charAt(x)));
                }

            }
        }

        for(int y = 0; y<newMaps.length; y++){
            for(int x = 0; x<newMaps[y].length; x++){
                int count = 0;

                if(newMaps[y][x] != 0 && !visited[y][x]){
                    count = bfs(x, y);
                }
                if(count > 0){
                    maxMap.add(count);
                }
            }
        }
        int[] answer ;
        if(maxMap.size() > 0){
            Collections.sort(maxMap);
            answer = maxMap.stream().mapToInt(i -> i).toArray();
        }
        else{
            answer = new int[] {-1};
        }



        return answer;
    }

    public int dfs(int x, int y){
        visited[y][x] = true;
        int count = newMaps[y][x];

        for(int i = 0 ; i < mx.length; i++){
            int nx = x+mx[i];
            int ny = y+my[i];
            if((ny > -1 && nx > -1) && ny < newMaps.length && nx <newMaps[0].length){
                if(!visited[ny][nx] && newMaps[ny][nx] != 0){
                    count += dfs(nx, ny);
                }
            }

        }

        return count;
    }
    public int bfs(int x, int y){
        Queue<int[]> que = new LinkedList<>();
        visited[y][x] = true;
        que.offer(new int[] {x, y});
        int count = newMaps[y][x];

        while(!que.isEmpty()){
            int[] next = que.poll();
            for(int i = 0; i<4; i++){
                int nx = next[0]+mx[i];
                int ny = next[1]+my[i];
                if((ny > -1 && nx > -1) && ny < newMaps.length && nx <newMaps[0].length){
                    if(!visited[ny][nx] && newMaps[ny][nx] != 0){
                        count += newMaps[ny][nx];
                        visited[ny][nx] = true;
                        que.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return count;
    }
}
