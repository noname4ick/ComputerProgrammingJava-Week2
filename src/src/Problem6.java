import java.util.Scanner;

public class Problem6 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in kg: ");
        double mass = input.nextDouble();
        double price;
        if(mass <= 2){
            price = 5;
        }else if(mass>=2 && mass<=10){
            price = 10;
        }else if(mass>10){
            price = 10 + (mass - 10)*2;
        }else{//covers the negative case
            System.out.println("Invalid");
            return;
        }

        System.out.printf("Price of the package is %.2f UZS",price);
        input.close();

    }
}