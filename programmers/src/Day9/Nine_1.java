package Day9;

import java.util.ArrayList;

public class Nine_1 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        int[] answer = {};
        ArrayList<Integer> ansArray = new ArrayList<>();
        for(int j=0; j< intStrs.length; j++){
            int parseNum = Integer.parseInt(intStrs[j].substring(s, s+l));
            if(parseNum > k){
                ansArray.add(parseNum);
            }
        }
        answer = new int[ansArray.size()];
        for(int i =0; i<answer.length ; i++){
            answer[i] = ansArray.get(i);
        }

    }
}
