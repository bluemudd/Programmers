package programmers;

import java.util.List;

public class keyboard {
    public static void main(String[] args){
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        int [] result = solution(keymap, targets);

        for(int i : result){
            System.out.println(i);
        }
    }
    public static int[] solution(String[] keymap, String[] targets){
        int[] result = new int[targets.length];
        int a =0;
        for(String target : targets){
            for(int i = 0; i< target.length(); i++){
                int min = Integer.MAX_VALUE;
                for(String key : keymap){
                    int num = key.indexOf(target.charAt(i));
                    if(min > num && num >= 0){
                        min = num+1;
                    }
                }
                result[a] += min;
            }
            a++;
        }
        return result;
    }
}
