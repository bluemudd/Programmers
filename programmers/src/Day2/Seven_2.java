package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Seven_2 {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        ArrayList<Integer> addResult = new ArrayList();
        for (int i = l; i <= r; i++) {
            if (i % 5 != 0) {
                continue;
            }
            String[] checkNum = (Integer.toString(i)).split("");

            if (checkZeroFive(checkNum)) {
                addResult.add(i);
            }
        }
        int[] answer = new int[addResult.size()];
        if (addResult.size() > 0){
            for(int i = 0; i<addResult.size(); i++){
                answer[i] = addResult.get(i);
            }
        }
        System.out.println(answer);

    }

    public static boolean checkZeroFive(String[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("5") || a[i].equals("0")) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
