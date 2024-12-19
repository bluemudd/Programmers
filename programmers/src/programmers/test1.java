package programmers;

import java.util.*;
import java.io.*;

public class test1 {
    public static void main(String[] args){
        int [] arrA = {4,3,2,1};
        int [] arrB = {5,4,2,1};
        boolean answer = false;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i< arrA.length; i++){
            q.add(arrA[i]);
        }
        while(true){
            int temp = q.poll();
            q.add(temp);
            System.out.println(q.toString());
            System.out.println(Arrays.toString(arrB));
            if(q.toString().equals(Arrays.toString(arrB))){
                answer = true;
                break;
            }
            else if(q.toString().equals(Arrays.toString(arrA))){
                break;
            }
        }
        System.out.println(answer);
    }
}
