package programmers;

public class PCCP_billsInMaPocket {
    public static void main(String[] args){
        int [] wallet = {50, 50};
        int [] bill = {100, 241};
        int count = 0;

        while(true) {
            int [] check = {0, 0};
            for (int i = 0; i < bill.length; i++) {
                for(int j = 0 ; j<wallet.length; j++){
                    if(bill[i] > wallet[j]){
                        check[i]++;
                        System.out.println(check[i]);
                    }
                }
            }

            if (check[0] > 0 && check[1] > 0 || check[0] == 2 || check[1] ==2) {
                count++;
                if (bill[0] > bill[1]) {
                    bill[0] = bill[0] / 2;
                    System.out.println(bill[0]);
                } else {
                    bill[1] = bill[1] / 2;
                    System.out.println(bill[1]);
                }
            }
            else if ((check[0] == 0 && check[1] > 0) || (check[0] > 0 && check[1] == 0)){
                break;
            }
            else{
                break;
            }
            System.out.println(count);
        }
        System.out.println(count);

    }
}
