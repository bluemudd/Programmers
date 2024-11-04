package baekjoon;
import java.util.*;
import java.io.*;


public class n2331 {
    static ArrayList<String> ans;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        ans = new ArrayList<>();
        doD(D, p);
        System.out.println(ans.size());
    }

    public static void doD(int D, int p){
        String NextD = Integer.toString(D);

        while(!ans.contains(NextD)){
//            System.out.println(NextD);
            ans.add(NextD);
            char [] ch = NextD.toCharArray();
            int sum = 0;
            for(int i = 0; i< ch.length; i++){

                sum+=Math.pow(Integer.parseInt(Character.toString(ch[i])), p);
            }
            NextD = Integer.toString(sum);
        }
        while(ans.contains(NextD)){
            ans.remove(NextD);
            char [] ch = NextD.toCharArray();
            int sum = 0;
            for(int i = 0; i< ch.length; i++){

                sum+=Math.pow(Integer.parseInt(Character.toString(ch[i])), p);
            }
            NextD = Integer.toString(sum);
        }
    }
}
