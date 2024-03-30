package controlstructures1;
import java.util.Scanner;

public class Practice2 {
    public static void main( String[] args ){
        /*Practice 2
        Code the program that displays the status of the numbers entered by the user
        "positive", "negative" or "zero" until the user wants to stop the program.
         */

         Scanner scan = new Scanner(System.in);

         String check;
         do{
            System.out.println("Enter a number: ");
            int number=scan.nextInt();
            if(number>0)
            System.out.println("Positive");
            else if(number<0)
            System.out.println("Negative");
            else{
            System.out.println("Zero");}
            System.out.println("Do you want to continue? Yes/No ");
            check = scan.next();
            }while("Yes".equals(check));

    }
}
