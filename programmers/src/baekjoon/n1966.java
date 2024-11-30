package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n1966 {
    public static void main(String[] args) throws IOException {
        Queue<int[]> q;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i< N; i++){
            st= new StringTokenizer(br.readLine());
            q = new LinkedList<>();
            int totalN = Integer.parseInt(st.nextToken());
            int foundN = Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());
            for(int j = 0; j<totalN; j++){
                int a =Integer.parseInt(st.nextToken());
//                System.out.println(j+" "+a);
                q.add(new int[]{j, a});
            }
            int count = 0;
            while(true){
                int[] a = q.poll();
                boolean chk = false;
                for(int[] curQ : q){
                    if(a[1] < curQ[1]){
                        chk = true;
                        break;
                    }
                }
                if(!chk){
                    count++;
                    if(a[0] == foundN){
                        break;
                    }
                }
                else{
                    q.add(a);
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
