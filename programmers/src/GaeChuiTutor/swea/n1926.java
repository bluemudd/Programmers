package GaeChuiTutor.swea;
import java.util.*;
import java.io.*;

public class n1926 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
            char [] a = (Integer.toString(i)).toCharArray();
            int nCount = 0;
            for(int j = 0; j<a.length; j++){
                char b = a[j];
                if(b =='3' || b =='6' || b == '9'){
                    nCount++;
                }
            }
            if(nCount == 0){
                bw.write(i+" ");
            }
            else{
                String ans = "";
                for(int m = 0; m<nCount; m++){
                    ans += "-";
                }
                bw.write(ans+" ");
            }
        }
        bw.flush();
    }

}
