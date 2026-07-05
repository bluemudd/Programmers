package programmers;

public class Painting {
    public static void main(String[] args){
        int n = 4;
        int m = 3;

        int [] section = {1,2,3,4};

        int maxPainted = 0;
        int count = 0;

        for(int sector : section){

            if(maxPainted <= sector){
                maxPainted = sector+m;

                count++;
            }
        }

        System.out.println(count);
    }
}
