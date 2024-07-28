package Day2;

import java.util.ArrayList;

public class Seven_5 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        ArrayList<Integer> stkArray = new ArrayList<>();
        int[] stk = {};
        int i = 0;
        while(i < arr.length){
            if(stkArray.isEmpty()){
                stkArray.add(arr[i]);
                i = i + 1;
            }
            else{
                if(stkArray.get(stkArray.size()-1) <  arr[i]){
                    stkArray.add(arr[i]);
                    i= i+1;
                }
                else {
                    stkArray.remove(stkArray.size()-1);
                }
            }
        }
        stk = new int[stkArray.size()];
        for(int j =0; j< stk.length; j++){
            stk[j] = stkArray.get(j);
        }

        System.out.println(stkArray);

    }
}
