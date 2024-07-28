package Day1;

public class Six_5 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int [] answer = new int[queries.length];
        for(int i =0; i< answer.length; i++) {
            int smallestOne = Integer.MAX_VALUE;
            for(int j = queries[i][0] ; j<= queries[i][1]; j++){
                if(arr[j]>queries[i][2]){
                   smallestOne = arr[j] < smallestOne ? arr[j] : smallestOne;
                }
            }
            if(smallestOne == Integer.MAX_VALUE){
                smallestOne = -1;
            }
            answer[i] = smallestOne;
            System.out.println(smallestOne);
        }
    }
}
