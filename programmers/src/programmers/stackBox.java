package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class stackBox {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        System.out.println(solution(n,w,num));
    }
    public static int solution(int n, int w, int num){
        List<List<Integer>> stacks = new ArrayList<>();
        int box = 1;

        while(box <= n){
            List<Integer> row = new ArrayList<>();
            for(int i = 0; i< w && box <= n; i++){
                row.add(box++);
            }

            if(stacks.size() % 2 == 1){
                Collections.reverse(row);
            }
            stacks.add(row);
        }

        int rowIdx = 0, colIdx = 0;
        for(int i = 0; i< stacks.size(); i++){
            if(stacks.get(i).contains(num)){
                rowIdx = i;
                colIdx = stacks.get(i).indexOf(num);
                break;
            }
        }
        int count = 0;
        for (int i = rowIdx; i >= 0; i--) { // 위에서부터 아래로
            if (colIdx < stacks.get(i).size()) { // 해당 위치가 존재하면 카운트
                count++;
            }
        }
        return count;
    }
}
