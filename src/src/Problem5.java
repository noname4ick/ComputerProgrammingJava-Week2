import java.util.Scanner;

public class Problem5 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("It is leap year");
        }else{
            System.out.println("It is not leap year duh");
        }
        input.close();

    }
}