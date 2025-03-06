package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RunningRace {
    static String[] players;
    static String[] callings;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        players = br.readLine().replaceAll("[\"\\[\\] ]", "").split(",");
        callings = br.readLine().replaceAll("[\"\\[\\] ]","").split(",");

        for(int i = 0; i<callings.length; i++){
            int swapIndex = Arrays.stream(players).collect(Collectors.toList()).indexOf(callings[i])-1;
            swap(swapIndex ,swapIndex+1);
        }
        String[] answer = players;


    }

    public static void swap(int change, int to){
        String swappingChange = players[change];
        players[change] = players[to];
        players[to] = swappingChange;
    }
}
