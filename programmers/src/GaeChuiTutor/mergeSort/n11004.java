package GaeChuiTutor.mergeSort;
import java.util.*;
import java.io.*;

public class n11004 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int find = Integer.parseInt(st.nextToken());

        int [] intArray = new int[row];
        int [] tmp = new int[row];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i< row; i++){
            intArray[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(intArray, tmp, 0, row-1);
        System.out.println(intArray[find-1]);
    }
    public static void mergeSort(int [] arr, int[] tmp, int start, int end){
        if(start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, mid, end);
        }
    }
    public static void merge(int[] arr, int[] tmp, int start, int mid, int end){
        for(int i=start; i<=end; i++) {
            tmp[i] = arr[i];
        }
        int part1 = start;
        int part2 = mid+1;
        int index = start;
        while(part1 <= mid && part2 <= end){
            if(tmp[part1]<= tmp[part2]){
                arr[index] = tmp[part1];
                part1++;
            }
            else if(tmp[part2] < tmp[part1]){
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        for(int i =0; i<= mid - part1; i++){
            arr[index+i] =tmp[part1 + i];
        }

    }
}
