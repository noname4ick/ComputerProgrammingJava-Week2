import java.util.Scanner;

public class Problem3 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time in seconds: ");
        int seconds = input.nextInt();
        int hours = seconds / 3600;
        seconds = seconds % 3600;
        int minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.printf("Hours: %d minutes: %d seconds %d",hours,minutes,seconds);
        input.close();
    }
}