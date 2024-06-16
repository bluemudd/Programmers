package Day1;

public class Six_1 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int [][] queries = {{0,3},{1,2},{1,4}};
        int swap ;
        for(int i = 0 ; i<queries.length; i++){
            swap=arr[queries[i][0]];
            arr[queries[i][0]]=arr[queries[i][1]];
            arr[queries[i][1]]= swap;
        }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
