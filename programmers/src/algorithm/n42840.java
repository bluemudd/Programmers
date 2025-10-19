package algorithm;

import java.util.*;

class n42840 {
    public int[] solution(int[] answers) {
        int [] personA = {1,2,3,4,5};
        int [] personB = {2,1,2,3,2,4,2,5};
        int [] personC = {3,3,1,1,2,2,4,4,5,5};
        List<Integer> correct = Arrays.asList(0, 0, 0);


        for (int i = 0; i<answers.length; i++){
            if(personA[(i % personA.length)] == answers[i]){
                correct.set(0, correct.get(0)+1);
            }
            if(personB[(i % personB.length)] == answers[i]){
                correct.set(1, correct.get(1)+1);
            }
            if(personC[(i % personC.length)] == answers[i]){
                correct.set(2, correct.get(2)+1);
            }
        }

        int max = Math.max(correct.get(0), Math.max(correct.get(1), correct.get(2)));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (correct.get(i) == max) list.add(i + 1);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}