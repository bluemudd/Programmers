package programmers;
import java.util.*;
import java.io.*;


public class NumberK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];

        for(int i = 0; i<commands.length; i++){

            int answers[] = (Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]));

            Arrays.sort(answers);

            answer[i] = answers[commands[i][2]-1];
        }



        return answer;
    }
}
