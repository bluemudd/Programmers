package GaeChuiTutor.swea;
import java.util.*;
import java.io.*;

public class n1954 {
        static int[] mx = {1, 0, -1, 0};
        static int[] my = {0, 1, 0, -1};

        public static void main (String args[]) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int T = Integer.parseInt(br.readLine());

            for (int test_case = 1; test_case <= T; test_case++) {
                int N = Integer.parseInt(br.readLine());
                if (N > 0 && N <= 10) {
                    int[][] snail = new int[N][N];
                    int x = 0;
                    int y = 0;
                    int go = 0;
                    int count = 1;
                    snail[y][x] = count;
                    while (count < N * N) {
                        int nx = x + mx[go];
                        int ny = y + my[go];
                        if (nx >= 0 && nx < N && ny >= 0 && ny < N && (snail[ny][nx] == 0)) {
                            snail[ny][nx] = ++count;
                            x = nx;
                            y = ny;
                        } else {
                            go = (go + 1) % 4;
                        }

                    }
                    System.out.println("#" + test_case);
                    printArray(snail);
                } else {
                    return;
                }
            }


        }
        public static void printArray ( int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }


