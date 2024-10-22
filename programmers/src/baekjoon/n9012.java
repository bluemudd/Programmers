package baekjoon;
import java.io.*;
import java.util.Stack;

public class n9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        Stack<String> st = new Stack<>();

        for(int i = 0; i < input; i++){
            String qs = br.readLine();
            if(stack(qs)){
                bw.write("YES"+"\n");
            }
            else{
                bw.write("NO"+"\n");
            }
        }
        bw.flush();


    }
    public static boolean stack(String st){
        Stack<String> stack = new Stack<>();
        for(int i =0; i<st.length(); i++){
            if(st.charAt(i) == '('){
                stack.add(String.valueOf(st.charAt(i)));
            }
            else if (st.charAt(i) == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    return false;
                }

            }
        }
        return stack.isEmpty() ? true : false;
    }
}
