package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class memoryScore {
    public static void main(String[] args){
        String[] name = {"may", "kein", "kain", "radi"};
        int [] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int [] score = new int[photo.length];
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0 ; i<name.length; i++){
            hm.put(name[i], yearning[i]);
        }
        for(int j = 0; j<photo.length; j++) {
            for (int i = 0; i < photo[j].length; i++) {
                if (hm.containsKey(photo[j][i])) {
                    score[j] += hm.get(photo[j][i]);
                }
            }
        }
    }
}
