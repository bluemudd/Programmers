package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NextCell {

    static int[] mh = {1, -1, 0, 0};
    static int[] mw = {0, 0, 1, -1};

    static String [][] boards;

    static int count ;

    public static void main(String[] args) throws Exception{
        boards = new String[][]{{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());

        count = 0;

        checkSameColor(h, w);


        System.out.println(count);
    }

    public static void checkSameColor(int h, int w){

        for(int i = 0; i<mh.length; i++){
            int nh = h+mh[i];
            int nw = w+mw[i];

            if((nh >= 0 && nh < boards.length) && (nw >= 0 && nw < boards[0].length)
            && (boards[h][w].equals(boards[nh][nw]))){
                count++;
            }
        }
    }
}
