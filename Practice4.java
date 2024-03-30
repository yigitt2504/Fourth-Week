package controlstructures1;
import java.util.Scanner;

public class Practice4 {
    public static void main( String[] args ){
        /*Practice 4
        Code the program that substracts and displays the smaller number of the two entered numbers from the higher number. */

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scan.nextInt();

        if(num1>num2)
        System.out.printf("%d", num1-num2);
        else
        System.out.printf("%d", num2-num1);

        scan.close();
        
    }
}
