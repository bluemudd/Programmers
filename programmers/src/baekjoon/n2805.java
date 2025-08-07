package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2805 {
    static int binSearch(int [] arr, int max, int needs){
        int low = 0;
        int high = max;
        int result = 0;

        while(low <= high) {
            int mid = (low + high) / 2;
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] - mid) >0 ){
                    sum += arr[i] - mid;
                }
            }
            if (sum >= needs) {
                result = mid;
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int needs = Integer.parseInt(st.nextToken());

        int [] arr = new int[len];
        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = arr[i] > max ? arr[i] : max;
        }

        System.out.println(binSearch(arr, max, needs));

    }
}
