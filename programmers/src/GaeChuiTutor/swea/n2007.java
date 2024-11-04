package GaeChuiTutor.swea;
import java.util.*;
import java.io.*;


class n2007
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        ArrayList<Character> ar;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            ar = new ArrayList<>();
            String str = br.readLine();
            int count = 0;
            char [] strArray = str.toCharArray();

            for(int i = 0; i<strArray.length; i++){
                if(strArray[0] == strArray[i] && i>0){
                    for(int j = 0 ; j< i; j++){
                        if(strArray[j] == strArray[i+j]){
                            count++;
                        }
                    }
                    if(count == i){
                        break;
                    }
                    count = 0;
                }
                ar.add(strArray[i]);

            }
            bw.write("#"+test_case+" "+ar.size()+"\n");
        }
        bw.flush();
    }
}