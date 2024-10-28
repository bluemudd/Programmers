package GaeChuiTutor.dfs;

public class targetNumber {
    static int [] numbers = {1, 1, 1};
    static int answer = 0;
    public static void main(String[] args){
        dfs(0,0);
        System.out.println(answer);
    }
    public static void dfs(int index, int sum ){
        if(index == 3){
            if (sum == 1){
                answer++;
            }
            return;
        }
        dfs(index+1, sum+numbers[index]);
        dfs(index+1, sum-numbers[index]);
    }
}
