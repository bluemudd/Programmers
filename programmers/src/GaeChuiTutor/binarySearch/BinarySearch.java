package GaeChuiTutor.binarySearch;

public class BinarySearch {
    static int[] arr;
    public static void main(String[] args){
        arr = new int[]{5, 7, 9, 15, 20, 38, 39, 52, 58, 77};
        binarySearch(58);
    }
    private static void binarySearch(int goal){
        int low = 0;
        int high = arr.length-1;

        while(high >= low){
            System.out.println("low: "+low+" "+" high: "+high);
            int mid = (low+high) / 2;
            if(goal == arr[mid]){
                break;
            }
            else if (goal < arr[mid-1]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

    }
}
