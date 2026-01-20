package baekjoon;

import java.io.*;
import java.util.*;


public class n1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = br.readLine();
        int N = Integer.parseInt(answer);
        Set<String> set = new HashSet<>();

        for(int i = 0; i< N; i++){

            set.add(br.readLine());

        }

        List<String> words = new ArrayList<>(set);

        words.sort(Comparator.comparing(String::length)
                .thenComparing(Comparator.naturalOrder()));

        words.forEach(System.out::println);

    }
}
