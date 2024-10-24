package baekjoon;
import java.io.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class n1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> con = new ArrayList<>();
        String ans = br.readLine();
        StringTokenizer stk = new StringTokenizer(ans," ");
        int N = Integer.parseInt(stk.nextToken());
        int order = Integer.parseInt(stk.nextToken());
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i<N; i++){
            q.add(i+1);
        }
        int count = 0;
        while(((q.size())+(q2.size()) > 0) ){
            count += 1;
            if(q.isEmpty()){
                q = q2;
                q2 = q;
            }
            if (count == order) {
                con.add(q.remove());
                count = 0;
            } else {
                q2.add(q.remove());
            }
        }
        String con1 = con.toString().replaceAll("\\[", "<").replaceAll("\\]", ">");
        System.out.println(con1);
    }
}
