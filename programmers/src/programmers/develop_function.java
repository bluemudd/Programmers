package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class develop_function {
    public static void main(String[] args){
        int [] progress = {93,30,55};
        int [] speeds = {1,30,5};

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();

        for(int i = 0 ; i<progress.length; i++){
            if((100-progress[i])%speeds[i]==0){
                q.add((100-progress[i])/speeds[i]);
            }
            else {
                q.add(((100 - progress[i]) / speeds[i]) + 1);
            }
        }
        st1.add(q.poll());
        st.add(1);
        while(!q.isEmpty()){
            int a = q.poll();
            if(a <= st1.peek()){
                int count = st.pop();
                count++;
                st.add(count);
            }
            else{
               st.add(1);
               st1.pop();
               st1.add(a);
            }
        }
        int[] answer = new int[st.size()];
        for(int j = 0 ; j< answer.length; j++){
            answer[answer.length - j-1] = st.pop();

        }


    }
}
