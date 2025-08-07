package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {

    static int binarySearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;
        while(pl <= pr){
            int pc = (pl+pr)/2;
            if(a[pc] == key){
                return pc;
            }
            else if(a[pc] >= key){
                pr = pc-1;
            }
            else{
                pl = pc+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputLength = Integer.parseInt(br.readLine());

        int[] a = new int[inputLength];

        for(int i = 0; i < inputLength; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int key = Integer.parseInt(br.readLine());

        System.out.println(binarySearch(a, inputLength, key));

    }
}
