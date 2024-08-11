package Day8;

public class Eight_3 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String result = "";
        for(int num : index_list){
            char ch = my_string.charAt(num);
            result = result.concat(String.valueOf(ch));
        }
        System.out.println(result);
    }
}
