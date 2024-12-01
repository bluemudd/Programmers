package baekjoon;

import java.util.*;
import java.io.*;

public class n7569 {

    static int [][][] tomatoMap;
    static Queue<int[]> q;

    static int [] mm = {-1, 1, 0, 0, 0, 0};
    static int [] mn = {0, 0, -1, 1, 0, 0};
    static int [] mh = {0, 0, 0, 0, -1, 1};

    static int M, N, H;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        tomatoMap = new int[H][N][M];
        q = new LinkedList<int[]>();
        for(int i = 0; i<H; i++){
            for(int j = 0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                for(int p = 0; p<M; p++){
                    tomatoMap[i][j][p] = Integer.parseInt(st.nextToken());
                    if(tomatoMap[i][j][p] == 1){
                        q.add(new int[]{i, j, p});
                    }
                }
            }
        }
        bfs();
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (tomatoMap[i][j][k] == 0) {
                        System.out.println("-1");
                        return; // 익지 않은 토마토가 있다면 바로 종료
                    }
                    result = Math.max(result, tomatoMap[i][j][k]);
                }
            }
        }
        System.out.println(result - 1); // 시작 시 1로 초기화했으므로 최종 결과에서 1을 뺌
    }

    public static void bfs(){
        while(!q.isEmpty()){
            int[] nowHnm = q.poll();
            for(int i = 0; i<mm.length; i++){
                int[] nextHnm = {nowHnm[0]+mh[i], nowHnm[1]+mn[i], nowHnm[2]+mm[i]};
                if(check(nextHnm)){
                    q.add(nextHnm);
                    tomatoMap[nextHnm[0]][nextHnm[1]][nextHnm[2]] =
                            tomatoMap[nowHnm[0]][nowHnm[1]][nowHnm[2]]+1;
                }
            }
        }
    }

    public static boolean check(int[] nextHnm){
        if(nextHnm[0]>=0 && nextHnm[0] < H){
            if(nextHnm[1]>=0 && nextHnm[1] < N){
                if(nextHnm[2]>=0 && nextHnm[2] <M){
                    if(tomatoMap[nextHnm[0]][nextHnm[1]][nextHnm[2]] == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}