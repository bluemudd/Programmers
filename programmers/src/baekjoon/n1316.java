package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int aLength = Integer.parseInt(br.readLine());

        String[] words = new String[aLength];

        for(int i = 0; i<words.length; i++){
            words[i] = br.readLine();
        }
        int count = 0;
        for(int i = 0 ; i<words.length ; i++){
            Stack<Character> ar = new Stack<>();
            for(int j = 0; j<words[i].length(); j++){
                if(!ar.contains(words[i].charAt(j))){
                    ar.add(words[i].charAt(j));
                }
                else if(ar.contains(words[i].charAt(j))&& ar.peek().equals(words[i].charAt(j))){
                    ar.add(words[i].charAt(j));
                }
                else{
                    break;
                }
            }
            if(ar.size() == words[i].length()){
                count++;
            }

        }
        System.out.println(count);


    }
}
