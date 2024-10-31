package GaeChuiTutor.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapSd {
    public static int [] mx = {-1, 1, 0, 0};
    public static int [] my = {0, 0, -1, 1};


    public static void main(String[] args){
        int [][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

        int [][] visited = new int[map.length][map[0].length];

        bfs(map, visited);

        if(visited[map.length-1][map[0].length-1]>0){
            System.out.println(visited[map.length-1][map[0].length-1]);
        }
        else{
            System.out.println(-1);
        }

    }
    public static void bfs(int[][] map, int [][] visited){
        Queue<int[]> q = new LinkedList<>();
        visited[0][0] = 1;
        q.offer(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] nowLoc = q.poll();
            if(nowLoc[0] == map.length && nowLoc[1] == map.length){
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = nowLoc[1] + mx[i];
                int ny = nowLoc[0] + my[i];
                if ((nx >= 0 && nx < map.length) && (ny >= 0 && ny < map.length)) {
                    if (map[ny][nx] == 1 && visited[ny][nx] == 0) {
                        visited[ny][nx] += visited[nowLoc[0]][nowLoc[1]]+1;
                        q.offer(new int[]{ny, nx});
                    }
                }
            }
        }


    }
}
