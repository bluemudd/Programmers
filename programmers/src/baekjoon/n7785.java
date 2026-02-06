package baekjoon;

import java.io.*;
import java.util.*;

public class n7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        HashMap<String ,Boolean> hm = new HashMap<>();

        for(long i = 0; i < n; i++){
            String[] log = (br.readLine()).split(" ");
            String worker = log[0];
            String active = log[1];

            if("enter".equals(active)){
                hm.put(worker,true);
            }
            else{
                hm.put(worker,false);
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> keys = hm.keySet();
        List<String> bwKeys = new ArrayList<>();


        for(String key : keys){
            if(hm.get(key)){
                bwKeys.add(key);
            }
        }
        bwKeys.sort(Comparator.reverseOrder());

        bwKeys.forEach(a -> {
            try {
                bw.write(a+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


        bw.flush();
    }
}
