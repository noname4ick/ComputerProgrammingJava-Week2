import java.util.Scanner;

public class Problem7 {
    public static void main(){
        final int psswd = 1234;
        int attempts = 3;
        int entrd;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your password");
            entrd = input.nextInt();
            if(entrd != psswd){
                attempts--;
                System.out.println("Access Denied Attempts Left "+attempts);
            }
            if(entrd == psswd){
                System.out.println("Access granted");
            }
        }while(attempts > 0 && entrd != psswd);
        if(attempts == 0){
            System.out.println("Account Locked");
        }
    }
}