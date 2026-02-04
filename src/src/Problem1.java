import java.util.Scanner;

public class Problem1{
    public static void main(){
        final double tip_price = 5.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of cappucino");
        double coffe_amount = input.nextDouble();
        System.out.println("Enter the amount of muffin");
        double muffin_amount = input.nextDouble();
        double total = (coffe_amount*4.5+muffin_amount*3.0)*1.08+tip_price;
        System.out.printf("Total price of coffe: %.2f sum",total);
        input.close();
    }
}