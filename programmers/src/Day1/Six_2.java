package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Six_2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int [][] queries = {{0,4,2},{0,3,2},{0,2,2}};
        int [] answer = new int[queries.length];
        List <int[]> choose = new ArrayList<>();
        //Stream API 함수 이용
        for(int i =0; i< queries.length; i++){
            // Arrays.copyOfRange() - 배열 슬라이스
            choose.add(Arrays.copyOfRange(arr, queries[i][0]+1, queries[i][1]+1));
            answer[i] = queries[i][2];
            if(answer[i] >= Arrays.stream(choose.get(i)).max().getAsInt()){
                answer[i] = -1;
            }
            else {
                for(int j =0; j<choose.get(i).length; j++){
                    if(answer[i] >= choose.get(i)[j]){
                        choose.get(i)[j] = 99;
                    }
                }
                answer[i] = Arrays.stream(choose.get(i)).min().getAsInt();

            }

        }
        for(int k = 0; k<answer.length; k++){
            System.out.println(answer[k]);
        }




    }
}
