package Day2;

import java.util.ArrayList;

public class Seven_4 {
    public static void main(String[] args) {
        int n = 10;
        int count = 1;
        ArrayList<Integer> shutup = new ArrayList<>();
        int[] answer = {};
        while(n > 1){
            System.out.println(n);
            shutup.add(n);
            if(n % 2 == 0){
                n = n/2;
            }
            else{
                n = 3*n+1;
            }
        }
        answer = new int[shutup.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = shutup.get(i);
        }
    }
}
