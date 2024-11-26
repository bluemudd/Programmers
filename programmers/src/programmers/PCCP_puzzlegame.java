package programmers;

public class PCCP_puzzlegame {
    static int [] diffs;
    static int [] times;

    public static void main(String[] args){
        int [] diffs = {1, 99999, 100000, 99995};
        int [] times = {9999, 9001, 9999, 9001};

        PCCP_puzzlegame.diffs = diffs;
        PCCP_puzzlegame.times = times;
        long limit = 3456789012l;
        int level = 0;
        long totalTimes = limit+1;
        while(totalTimes > limit){
            totalTimes = 0;
            level++;
            for(int i = 0; i<diffs.length; i++){
                totalTimes+=doPuzzle(i, level);
            }
            System.out.println(level+" "+totalTimes);
        }


    }

    private static long doPuzzle(int turn, int level){
        long sumTimes = 0;
        if(turn == 0){
            if(diffs[turn]<=level){
                sumTimes += times[turn];
            }
            else{
                sumTimes += (diffs[turn]-level)*times[turn];
            }
        }
        else{
            if(diffs[turn]<=level){
                sumTimes += times[turn];
            }
            else{
                sumTimes += (diffs[turn]-level)*(times[turn]+times[turn-1]);
                sumTimes += times[turn];
            }
        }

        return sumTimes;
    }
}
