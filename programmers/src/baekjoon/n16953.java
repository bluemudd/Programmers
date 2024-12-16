package baekjoon;
import java.io.*;
import java.util.StringTokenizer;


public class n16953 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println(change(N, M));
    }
    static int change(int N, int M){
        int count = 1;
        while(M != N){
            if(M < N){
                return -1;
            }
            if(M % 2 == 0){
                M = M / 2;
                count++;
            }
            else if (String.valueOf(M).charAt(String.valueOf(M).length()-1) == '1' ){
                M = Integer.parseInt(String.valueOf(M).substring(0, String.valueOf(M).length()-1));
                count++;
            }
            else{
                return -1;
            }
        }
        return count;
    }
}
