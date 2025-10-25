package algorithm;

import java.util.*;

class n42895 {
    public int solution(int N, int number) {
        if(N == number) return 1;

        Set<Integer> [] dp = new HashSet[9];

        for(int i = 1; i<9; i++){
            dp[i] = new HashSet<>();
        }
        for(int i = 1; i<9; i++){
            int num = 0;
            for(int j = 0; j<i; j++){
                num = num*10+N;
            }
            dp[i].add(num);

            for(int j = 1; j<i; j++){
                for (int a : dp[j]){
                    for(int b : dp[i-j]){
                        dp[i].add(a+b);
                        dp[i].add(a-b);
                        dp[i].add(a*b);
                        if(b != 0){
                            dp[i].add(a/b);
                        }
                    }
                }
            }
            if(dp[i].contains(number))  return i;
        }

        return -1;


        // int answer = 0;
        // return answer;
    }
}