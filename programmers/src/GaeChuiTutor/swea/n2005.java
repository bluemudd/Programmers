package GaeChuiTutor.swea;
import java.util.*;
import java.io.*;


public class n2005 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            int N = Integer.parseInt(br.readLine());
            int [][] square = new int[N][];
            for(int i = 0; i<N; i++){
                square[i] = new int[i+1];
            }
            square[0][0] = 1;
            for(int j=1; j< square.length; j++){
                for(int m=0; m<square[j].length; m++){
                    if(m-1 >=0 && m<square[j-1].length) {
                        square[j][m] = square[j-1][m] + square[j-1][m-1];
                    }
                    else if (m-1 <0){
                        square[j][m] = square[j-1][m];
                    }
                    else {
                        square[j][m] = square[j-1][m-1];
                    }
                }
            }
            System.out.println("#"+T);
            printArray(square);

        }
    }

    private static void printArray(int [][] square){
        for(int i = 0; i < square.length; i++){
            for(int j = 0; j< square[i].length; j++){
                System.out.print(square[i][j]+" ");
            }
            System.out.println();
        }
    }
}
