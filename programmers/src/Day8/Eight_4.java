package Day8;

public class Eight_4 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        int sum = 0;
        int result;
        for(int i = 0; i< number.length(); i++){
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        result = sum%9;
        System.out.println(result);

    }
}
