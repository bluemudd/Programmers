package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class n1026 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        String [] strA = br.readLine().split(" ");
        String [] strB = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            listA.add(Integer.parseInt(strA[i]));
            listB.add(Integer.parseInt(strB[i]));
        }

        listA.sort(Comparator.naturalOrder());
        listB.sort(Comparator.reverseOrder());

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += listA.get(i)*listB.get(i);
        }

        System.out.println(sum);


    }
}
