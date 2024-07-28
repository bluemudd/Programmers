package Day2;

public class Seven_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int [][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};

        int s, e, k ;
        for(int j = 0; j<queries.length; j ++){
            for(int i = 0; i<arr.length; i++){
                s = queries[j][0];
                e = queries[j][1];
                k = queries[j][2];
                if(i >= s && i <= e){
                    if((i % k) == 0){
                        arr[i] += 1;
                    }
                    else{
                        continue;
                    }
                }
                else{
                    continue;
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
