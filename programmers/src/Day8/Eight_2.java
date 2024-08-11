package Day8;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Eight_2 {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(5)+1;
        int b = random.nextInt(5)+1;
        int c = random.nextInt(5)+1;
        int d = random.nextInt(5)+1;
        int[] arr = {a, b, c, d};

        int result ;

        HashMap<Integer, Integer> makeList = new HashMap<>();
        for(int num : arr){
            if(makeList.containsKey(num)){
                makeList.replace(num, makeList.get(num)+1);
            }
            else{
                makeList.put(num, 1);
            }
            System.out.println(makeList);
        }
        if(makeList.size() == 1){
            Set<Integer> keySet = makeList.keySet();
            int p = (int) keySet.toArray()[0];
            System.out.println(p);
            result= p*1111;
        }
        else if (makeList.size() == 2){
            Set<Integer> keySet = makeList.keySet();
            int p = (int) keySet.toArray()[0];
            int q = (int) keySet.toArray()[1];
            if(makeList.get(p) == 3){
                result = (int) Math.pow(((10*p) + q),2);
            }
            else if(makeList.get(p) == 2){
                result = (p+q)*Math.abs(p-q);
            }
            else{
                result = (int) Math.pow(((10*q) + p), 2);
            }
        }
        else if (makeList.size() == 3){
            Set<Integer> keySet = makeList.keySet();
            int p = (int) keySet.toArray()[0];
            int q = (int) keySet.toArray()[1];
            int r = (int) keySet.toArray()[2];
            if(makeList.get(p) == 2){
                result = q*r;
            }
            else if(makeList.get(q) == 2){
                result = p*r;
            }
            else{
                result = p*q;
            }
        }
        else{
            int minKey = Collections.min(makeList.keySet());
            result = minKey;
        }
        System.out.println(result);
    }
}
