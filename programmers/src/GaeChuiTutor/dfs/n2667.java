package GaeChuiTutor.dfs;
import java.io.*;
import java.util.*;

public class n2667 {
    public static boolean [][] graph;
    public static boolean [][] visited;

    public static int [] mx = {1, -1, 0, 0};
    public static int [] my = {0, 0, 1, -1};

    public static int aptCount;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        if(N <5){
            return;
        }
        ArrayList<Integer> aptList = new ArrayList<>();
        graph = new boolean[25][25];
        visited = new boolean[25][25];


        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j =0; j<N; j++){
                graph[i][j] = (s.charAt(j) == '1');

            }
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(graph[i][j] && !visited[i][j]){
                    aptCount = 0;
                    dfs(i, j);
                    aptList.add(aptCount);
                }

            }
        }
        System.out.println(aptList.size());
        Collections.sort(aptList);
        for(int i = 0; i< aptList.size(); i++){
            System.out.println(aptList.get(i));
        }

    }

    public static void dfs(int y, int x){
        visited[y][x] = true;
        aptCount++;
        for(int i = 0; i<4 ;i++){
            int nx = x+mx[i];
            int ny = y+my[i];
            if((nx >= 0 && nx < graph.length) && (ny >=0 && ny < graph.length)){
                if(graph[ny][nx] && !visited[ny][nx]){
                    dfs(ny, nx);
                }
            }
        }
    }
}
