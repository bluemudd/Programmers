package baekjoon;

import java.util.*;
import java.io.*;


public class n10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Set<Integer> se = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            se.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        ArrayList<Integer> ar = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< M ; i++){

            if(se.contains(Integer.parseInt(st.nextToken()))){
                ar.add(1);
            }
            else{
                ar.add(0);
            }
        }

        for(int i = 0; i< M; i++){
            System.out.print(ar.get(i)+" ");
        }

    }
}
