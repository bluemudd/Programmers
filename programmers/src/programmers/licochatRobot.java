package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class licochatRobot {
    static int [] mx = {1, -1 , 0, 0};
    static int [] my = {0, 0, 1, -1};
    static String [] board;
    static boolean visited[][];
    static int toCount = Integer.MAX_VALUE;

    public static void main(String[] args){
        board = new String[]{".D.R", "....", ".G..", "...D"};
        int gx = 0 ;
        int gy = 0 ;
        int purposeX = 0;
        int purposeY = 0;
        visited = new boolean[board.length][board[0].length()];
        for(int i =0; i<board.length; i++){
            for(int j = 0; j<board[i].length(); j++){
                if(board[i].charAt(j) == 'R'){
                    gx = j;
                    gy = i;
                }
                if(board[i].charAt(j) == 'G'){
                    purposeX = j;
                    purposeY = i;

                }
            }
        }
        bfs(new int[]{gx, gy, 0});
        if(visited[purposeY][purposeX] == false){
            System.out.println(-1);
        }
        else{
            System.out.println(toCount);
        }

    }

    private static void bfs(int [] xy){
        Queue<int[]> q = new LinkedList<>();
        q.add(xy);
        while(!q.isEmpty()){
            int[] nxy = q.poll();
            int nx = nxy[0];
            int ny = nxy[1];
            int count = nxy[2];
//            System.out.println(nx+" ,"+ny);
            if(board[ny].charAt(nx) == 'G'){
                System.out.println(nx+" ,"+ny);
                Math.min(toCount, count);
                break;
            }
            if(!visited[ny][nx]){
                visited[ny][nx] = true;
                for(int i = 0; i< 4; i++){
                        int [] stop = move(nx, ny, i, count);
                        q.offer(stop);
                }
            }
        }
    }

    private static int[] move(int x, int y, int go, int count){
        int nx = x;
        int ny = y;

        while(stop(nx, ny)){
            nx += mx[go];
            ny += my[go];
        }
        return new int[] {nx-mx[go], ny-my[go], count+1};
    }
    private static boolean stop(int x, int y){
        if(x< 0 || y <0){
            return false;
        }
        if(y >= board.length || x >= board[y].length()){
            return false;
        }
        if(board[y].charAt(x) == 'D') {
            return false;
        }
        return true;
    }
}
