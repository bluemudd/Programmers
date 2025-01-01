package baekjoon;

import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class n1920 {
    static int[] arr;
    static int[] findArr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int AN = Integer.parseInt(br.readLine());
        arr = new int[AN];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < AN ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        IntStream is = Arrays.stream(arr).sorted();
        arr = is.toArray();

        int FN = Integer.parseInt(br.readLine());
        findArr = new int[FN];
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j< FN; j++){
            findArr[j] = Integer.parseInt(st.nextToken());
        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i< FN; i++){
            System.out.println(binarySearch(findArr[i]));
        }


    }

    private static int binarySearch(int goal){
        int high = arr.length -1;
        int low = 0;

        while(high >= low){
            int mid = (high+low) / 2;
//            System.out.println(mid);

            if(arr[mid] == goal){
//                System.out.println(arr[mid]);
                return 1;
            }
            else if (arr[mid] < goal){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return 0;
    }
}
