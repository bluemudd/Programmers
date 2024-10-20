package GaeChuiTutor.hash;
import java.util.HashMap;

public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion){
            String answer = "";
//        1. Hash map을 만든다. (participant)
        HashMap<String, Integer> map = new HashMap<>();
        for(String part : participant){
            map.put(part, map.getOrDefault(part, 0) + 1);
        }
//        2. Hash map을 뺀다   (completion)
        for(String comp : completion){
            map.put(comp, map.get(comp) - 1);
        }
//        3. value가 0이 아닌 마지막 주자를 찾는다.
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                answer = key;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};

        UnfinishedPlayer sol = new UnfinishedPlayer();
        System.out.println(sol.solution(part, comp));
    }
}
