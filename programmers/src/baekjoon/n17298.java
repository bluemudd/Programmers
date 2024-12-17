package baekjoon;

import java.io.*;
import java.util.*;

public class n17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int A [] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        // 4 2 7 8 5 9 3 6

        for(int i =0; i<N; i++){
            int ps = Integer.parseInt(st.nextToken());
            A[i] = ps;
        }
        for(int i = 0; i< N; i++){


            while(!stack.isEmpty() && A[stack.peek()] < A[i]){
                A[stack.pop()] = A[i];
            }

            stack.push(i);
        }

        while(!stack.isEmpty()){
            A[stack.pop()] = -1;
        }

        for(int i = 0; i< N; i++){
            bw.write(A[i]+" ");
        }
        bw.flush();

    }
}
