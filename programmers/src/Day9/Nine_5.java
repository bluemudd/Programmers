package Day9;

import java.util.ArrayList;
import java.util.List;

public class Nine_5 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";
        List<String> words = new ArrayList<>();
        for(int i = 0; i< my_string.length(); i++){
            words.add(my_string.substring(i));
        }
        if(words.contains(is_suffix)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
