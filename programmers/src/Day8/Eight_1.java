package Day8;

public class Eight_1 {
    public static void main(String[] args) {
        boolean x1 = true;
        boolean x2 = true;
        boolean x3 = false;
        boolean x4 = false;
        boolean answer;

        answer = upper(lower(x1, x2), lower(x3, x4));

        System.out.println(answer);
    }
    public static boolean upper(boolean a, boolean b){
        if(a == true && b == true){
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean lower(boolean a, boolean b){
        if(a == false && b == false){
            return false;
        }
        else{
            return true;
        }
    }
}
