package GaeChuiTutor.hash;

import java.util.HashMap;

public class PhoneBookList {
    public static void main(String[] args){
        String[] phoneBook = {"119", "97674223", "1195524421"};
        solution(phoneBook);
    }

    public static boolean solution(String[] phoneBook){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i =0; i< phoneBook.length; i++){
            map.put(phoneBook[i], 1);
        }

        for(int j=0; j<map.size(); j++){
            for(int k=1; k<phoneBook[j].length(); k++){
                if(map.containsKey(phoneBook[j].substring(0, k))){
                    return false;
                }
            }
        }
        return true;

    }

}
