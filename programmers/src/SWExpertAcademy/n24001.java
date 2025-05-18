package SWExpertAcademy;

import java.io.*;

public class n24001 {
    static int maxDistance;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int turn = Integer.parseInt(br.readLine());
        for(int i =0; i<turn; i++) {
            String input = br.readLine();
            maxDistance = 0;
            dfs(input.toCharArray(), 0, 0);
            bw.write(maxDistance+"\n");
        }
        bw.flush();

    }

    static void dfs(char[] s, int idx, int position){
        if(idx == s.length) return;

        if(s[idx] == 'L'){
            position --;
            maxDistance = Math.max(maxDistance, Math.abs(position));
            dfs(s, idx+1, position);
        } else if (s[idx] == 'R'){
            position ++;
            maxDistance = Math.max(maxDistance, Math.abs(position));
            dfs(s, idx+1, position);
        } else{
            dfs(s, idx+1, position -1);
            dfs(s, idx+1, position +1);
            maxDistance = Math.max(maxDistance, Math.abs(position-1));
            maxDistance = Math.max(maxDistance, Math.abs(position+1));
        }
    }
}
