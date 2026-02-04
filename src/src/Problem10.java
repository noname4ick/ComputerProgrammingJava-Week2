import java.util.Scanner;

public class Problem10 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        double deposit = 1000;
        double rate = 5;
        int years = input.nextInt();
        for (int i = 1; i <= years; i++){
            deposit = deposit + (deposit*rate/100);
            System.out.printf("Your balance in Year %d : %.2f UZS \n",i,deposit);
        }
        input.close();
    }
}