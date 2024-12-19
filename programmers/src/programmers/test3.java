package programmers;

import java.sql.Array;
import java.util.*;
import java.io.*;

public class test3 {
    public static void main(String[] args){
        int n = 6;
        int [] student = {3,2,10,2,8,3,9,6,1,2};
        int [] point = {3,2,2,5,4,1,2,1,3,3};

        ArrayList<kid> kids = new ArrayList<>();
        Set hi = new HashSet();
        Set lo = new HashSet();
        for(int i = 0; i<n; i++){
            kids.add(new kid(i, 0));
        }
        for(int m = 0; m < n/2; m++){
            lo.add(kids.get(m).num);
        }
        for(int m = n/2; m < n; m++){
            hi.add(kids.get(m).num);
        }
        String change = lo.toString()+hi.toString();
        int count = 0;
        for(int i = 0; i<student.length; i++){
            hi = new HashSet();
            lo = new HashSet();
            for(int j = 0; j<kids.size() ; j++){
                if(kids.get(j).num == student[i]-1){
                    kids.get(j).setPlusnum(kids.get(j).plusnum+point[i]);
                }
            }
            Collections.sort(kids, Collections.reverseOrder());
            System.out.println(kids.toString());
            for(int m = 0; m < n/2; m++){
                hi.add(kids.get(m).num);
            }
            for(int m = n/2; m < n; m++){
                lo.add(kids.get(m).num);
            }
            String exchange = lo.toString()+hi.toString();
            if(!change.equals(exchange)){
                change = exchange;
                count++;
            }
            else{
                change = exchange;
            }
            System.out.println(count);
        }
        int answer = count;
        System.out.println(count);

    }
}
class kid  implements Comparable<kid>{
    int num;
    int plusnum;

    public kid(int num, int plusnum){
        this.num = num;
        this.plusnum = plusnum;
    }

    public void setPlusnum(int plusnum) {
        this.plusnum = plusnum;
    }

    @Override
    public int compareTo(kid akid){
        if(akid.plusnum < plusnum){
            return 1;
        } else if(akid.plusnum > plusnum){
            return -1;
        }
        else if (akid.plusnum == plusnum){
            if (akid.num > num){
                return 1;
            }
            else{
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "[" + this.num+" "+this.plusnum+"]";
    }
}
