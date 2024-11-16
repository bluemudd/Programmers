package programmers;
import java.util.*;
import java.io.*;

public class mix {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        int s = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        Stack<Character> st = new Stack<Character>();


        String slice_string = my_string.substring(s, e+1);
        char[] slice_strings = my_string.toCharArray();
        char[] c = slice_string.toCharArray();
        for(int i = 0 ; i<c.length; i++){
            st.add(c[i]);
        }
        for(int j = s; j<=e; j++){
            char swap = st.pop();
            slice_strings[j] = swap;
        }
        String answer = String.valueOf(slice_strings);
        System.out.println(answer);
    }
}
