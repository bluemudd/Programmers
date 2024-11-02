package GaeChuiTutor.quickSort;

import java.io.*;
import java.util.*;

public class n11004 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int order = Integer.parseInt(st.nextToken());

        int[] arr = new int[size];
        st = new StringTokenizer(br.readLine());
        int i = 0;
        while(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        quickSort(arr, 0, arr.length-1);
        System.out.println(arr[order-1]);

    }
    public static void quickSort(int[] arr, int start, int end){
        int pivot = partition(arr, start, end);
        if(start < pivot-1){
            quickSort(arr, start, pivot-1);
        }
        if(pivot < end){
            quickSort(arr, pivot, end);
        }

    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[(start+end)/2];
        while(start <= end){
            while(arr[start]<pivot){
                start++;
            }
            while(pivot<arr[end]){
                end--;
            }
            if(start<= end){
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
        }
        return start;
    }
}
