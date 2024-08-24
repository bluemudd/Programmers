package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nine_4 {
    public static void main(String[] args) {
        String my_string = "banana";
        String [] words = new String[my_string.length()];

        for(int i =0; i<my_string.length(); i++){
            words[i] = my_string.substring(i);
        }
        Arrays.sort(words);
        for(int j = 0; j<words.length; j++){
            System.out.println(words[j]);
        }

    }
}
