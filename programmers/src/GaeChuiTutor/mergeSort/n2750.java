package GaeChuiTutor.mergeSort;
import java.util.*;
import java.io.*;

public class n2750 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i< N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int [] tmp = new int[N];
        mergeSort(0, N-1 ,arr, tmp);
        for(int i = 0; i< N ; i++){
            System.out.println(arr[i]);
        }

    }
    private static void mergeSort(int start, int end, int[] arr, int[] tmp){
        if(start < end){
            int mid = (start+end)/ 2;

            mergeSort(start, mid, arr, tmp);
            mergeSort(mid+1, end, arr, tmp);
            merge(start, mid, end, arr, tmp);
        }
    }
    private static void merge(int start, int mid, int end, int[] arr, int[] tmp){
        for(int i = 0; i<=end; i++){
            tmp[i] = arr[i];
        }
        int index = start;
        int part1 = start;
        int part2 = mid+1;

        while(part1<= mid &&  part2<= end){
            if(tmp[part1] <= tmp[part2]){
                arr[index] = tmp[part1];
                part1++;
            }
            else{
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        for(int i = 0; i<= mid - part1; i++){
            arr[index+i] = tmp[part1+i];
        }
    }

}
