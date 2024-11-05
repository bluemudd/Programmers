package GaeChuiTutor.chatGPT;

import java.io.*;
import java.util.*;

public class chatGPT {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        st= new StringTokenizer(br.readLine());

        int mem = Integer.parseInt(st.nextToken());
        int top = Integer.parseInt(st.nextToken());
        Integer[] member = new Integer[mem];
        st= new StringTokenizer(br.readLine());
        int i = 0;
        while(st.hasMoreTokens()){
            member[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(member, Collections.reverseOrder());
        for(int j = 0; j< top; j++){
            System.out.print(member[j]+" ");
        }
    }
}
