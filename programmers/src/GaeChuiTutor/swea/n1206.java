package GaeChuiTutor.swea;
import java.util.*;
import java.io.*;

public class n1206 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[] APT = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                APT[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            int[] intArray = new int[4];
            for (int i = 2; i < APT.length - 2; i++) {
                intArray[0] = APT[i - 2];
                intArray[1] = APT[i - 1];
                intArray[2] = APT[i + 1];
                intArray[3] = APT[i + 2];
                Arrays.sort(intArray);

                if (APT[i] - intArray[3] > 0) {
                    sum += APT[i] - intArray[3];
                }
            }

            bw.write("#" + test_case + " " + sum + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
