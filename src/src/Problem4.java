import java.util.Scanner;

public class Problem4 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        int price;
        if(age>=0 && age<= 12){
            price = 7;
        }else if(age>=13 && age<=17 || age>=65){
            price = 10;
        }else if(age>=18){
            price = 15;
        }else{
            System.out.println("Invalid");
            return;
        }
        System.out.println("Pirce of the ticket according to your age will be "+price);

        input.close();

    }
}