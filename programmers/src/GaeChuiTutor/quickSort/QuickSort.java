package GaeChuiTutor.quickSort;

public class QuickSort {
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    public static void quickSort(int[] arr, int start, int end){
        int subPart = partition(arr, start, end);
        if(start < subPart-1){
            quickSort(arr, start, subPart-1);
        }
        if(subPart < end){
            quickSort(arr, subPart, end);
        }

    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[(start+end)/2];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(pivot< arr[end]){
                end--;
            }
            if(start<=end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }
    public static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    public static void printArray(int[] arr){
        for(int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();

        }
    public static void main(String[] args){
        int[] arr = {3,9,4,7,5,0,1,6,8,2};
        printArray(arr);
        quickSort(arr);
        printArray(arr);

    }
}
