package GaeChuiTutor.swea;
import java.util.*;
import java.io.*;

public class n1989 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        Deque<Character> dq;
        for(int test_case = 1; test_case <= T; test_case++) {
            String input = br.readLine();
            char[] ans = input.toCharArray();
            dq = new LinkedList<>();
            for(int i = 0; i< ans.length; i++){
                dq.offer(ans[i]);
            }
            while(dq.size() > 1){
                if(dq.getFirst() == dq.getLast()) {
                    dq.pollFirst();
                    dq.pollLast();
                }
                else{
                    break;
                }
            }
//            System.out.println(dq.size());
            if(dq.size() == 1 || dq.size() == 0){
                bw.write("# "+test_case+" 1\n");
            }
            else{
                bw.write("# "+test_case+" 0\n");
            }

        }
        bw.flush();
    }
}
