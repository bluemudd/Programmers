package GaeChuiTutor.hash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Spy {
    public static void main(String[] args){
        String[][] clothes ={{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> keyList = new ArrayList<>();
        for(int i =0; i<clothes.length; i++){
            if(!hm.containsKey(clothes[i][1])){
                keyList.add(clothes[i][1]);
                hm.put(clothes[i][1], 2);
            }
            else{
                hm.put(clothes[i][1], hm.get(clothes[i][1])+1);
            }
        }
        int sum=1;
        for(int i =0; i<keyList.size(); i++){
            sum *= hm.get(keyList.get(i));
        }
        System.out.println(sum-1);

    }
}
