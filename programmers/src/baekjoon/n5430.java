package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class n5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int test_case = Integer.parseInt(br.readLine());
        for(int i = 0; i<test_case; i++) {

            Deque<String> dq = new LinkedList();

            String order = br.readLine();
            int size = Integer.parseInt(br.readLine());
            String[] array = new String[size];
            array = (br.readLine().replace("[", "").replace("]", "").replace(" ", "")).split(",");

            for (int m = 0; m < size; m++) {
                dq.offer(array[m]);
            }

            boolean align = true;
            for (int j = 0; j < order.length(); j++) {
                if (!dq.isEmpty()) {
                    if ((order.charAt(j)) == 'D') {
                        if (!align) {
                            dq.pollLast();
                        } else {
                            dq.pollFirst();
                        }
                    } else if ((order.charAt(j)) == 'R') {
                        if (align) {
                            align = false;
                        } else {
                            align = true;
                        }

                    }
                }
                else {
                    if(!order.isEmpty() && !(order.charAt(j) == 'R')){
                        bw.write("\nerror");
                    }
                    break;
                }
            }
                int dqsize = dq.size();
                if(i != 0){
                    bw.write("\n");
                }
                if (align) {
                    bw.write("[");
                    for (int p = 0; p < dqsize - 1; p++) {
                        bw.write(dq.pollFirst());
                        bw.write(",");
                    }
                    if(!dq.isEmpty()){
                        bw.write(dq.pollFirst());
                    }
                    bw.write("]");
                } else {
                    bw.write("[");
                    for (int p = 0; p < dqsize - 1; p++) {
                        bw.write(dq.pollLast());
                        bw.write(",");
                    }
                    if(!dq.isEmpty()){
                        bw.write(dq.pollFirst());
                    }
                    bw.write("]");
                }
        }
        bw.flush();


    }
}
