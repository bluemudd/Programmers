package GaeChuiTutor.dfs;
import java.util.*;

class oil_dfs {
    static int [] mx = {-1, 1, 0, 0};
    static int [] my = {0, 0, -1, 1};
    static boolean[][] visited ;
    static int count;
    static Set<Integer>  set;
    public static int solution(int[][] land) {
        visited = new boolean[land.length][land[0].length];
        int [] oil = new int[land[0].length];
        for(int i = 0 ; i<land.length ; i++){
            for(int j = 0; j<land[0].length; j++){
                if(!visited[i][j] && land[i][j] == 1) {
                    count = 0;
                    set = new HashSet<>();
                    dfs(j, i, land);
                    for(int index : set){
                        oil[index] += count;
                    }
                }
            }

        }
        int answer = Arrays.stream(oil).max().getAsInt();
        return answer;
    }
    public static void main(String[] args){
        int [][] land = {{1, 0, 1, 0, 1, 1}, {1, 0, 1, 0, 0, 0}, {1, 0, 1, 0, 0, 1}, {1, 0, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 1}, {1, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};
        solution(land);
    }
    private static void dfs(int x, int y ,int[][] land){
        visited[y][x] = true;
        set.add(x);
        count++;
        for(int i = 0; i< 4; i++){
            int nx = x+mx[i];
            int ny = y+my[i];
            if((nx >=0)&&(nx<land[0].length)&&(ny >= 0)&&(ny<land.length) && (land[ny][nx] == 1)){
                if(!visited[ny][nx]){
                    dfs(nx, ny, land);
                }
            }
        }
    }
}