package Day8;

public class Eight_5 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int [][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        StringBuffer sb ;
        for(int []query : queries){
            sb = new StringBuffer(my_string.substring(query[0], query[1]+1));
            my_string = my_string.substring(0,query[0])+sb.reverse()+my_string.substring(query[1]+1);
        }
        System.out.println(my_string);
    }
}
