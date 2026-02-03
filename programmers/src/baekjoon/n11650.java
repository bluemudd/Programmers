package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class n11650 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer[]> list = new ArrayList<Integer[]>();

        for(int i = 0; i<n; i++){
            String point = br.readLine();
            String[] pointXY = point.split(" ");

            list.add(new Integer[]{Integer.valueOf(pointXY[0]), Integer.valueOf(pointXY[1])});
        }

        list.sort(
                Comparator.comparingInt((Integer[] a) -> a[0])
                        .thenComparing((Integer[] a) -> a[1])
        );

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
        }
    }
}
