package GaeChuiTutor.swea;

import java.util.*;
import java.io.*;

public class n1989_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            String ans = br.readLine();
            int count = 0;
            for (int i = 0; i < (ans.length() / 2); i++) {
                if (ans.charAt(i) == ans.charAt(ans.length() - i - 1)) {
                    count++;
                }
            }
            if (count == (ans.length() / 2)) {
                bw.write("#" + test_case + " 1\n");
            } else {
                bw.write("#" + test_case + " 0\n");
            }

        }
        bw.flush();
    }
}
