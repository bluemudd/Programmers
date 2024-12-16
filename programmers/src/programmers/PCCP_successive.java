package programmers;


import java.util.*;

public class PCCP_successive {
//    public static void main(String[] args){
//        int [] sequence = {2, 2, 2, 2, 2};
//        int k = 6;
//        int [] answer = new int[]{0, sequence.length-1};
//
//        for(int i = 0; i<sequence.length; i++){
//            for(int j = i; j<sequence.length; j++){
//                int[] slice = Arrays.copyOfRange(sequence, i, j+1);
//                if(Arrays.stream(slice).sum() == k){
//                    if(answer[1]-answer[0] > j-i){
//                        answer = new int[] {i, j};
//                    }
//                    else if (answer[1]-answer[0] == j-i){
//                        if(answer[0] > i){
//                            answer = new int[] {i, j};
//                        }
//                    }
//
//                }
//            }
//        }
//
//        System.out.println(answer[0]+" "+answer[1]);
//
//
//    }

    public static void main(String[] args){
        int [] sequence = {1,2,3,4,5};
        int k = 7;

        int left = 0;
        int right = 0;

        int n = sequence.length;

        int partitionSum = sequence[0];

        List<int []> subs = new ArrayList<>();

        while(true){
            if(partitionSum == k){
                subs.add(new int[]{left, right});
                if(left < n){
                    left++;

                }
                if(right < n){
                    right++;
                }
            }
            else if(partitionSum > k){

                if(left < n){
                    partitionSum -= sequence[left];
                    left++;
                }
            }
            else if(partitionSum < k){
                if(right < n){
                    right++;
                    partitionSum += sequence[right];
                }

            }
            if(left == n && right == n){
                break;
            }
        }
    }
}
