package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class n10773 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int turn = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i =0; i<turn; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                stack.pop();
            }
            else {
                stack.add(num);
            }
        }
        while(!stack.isEmpty()){
            sum+= stack.pop();
        }
        System.out.println(sum);
    }
}
