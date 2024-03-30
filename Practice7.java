package controlstructures1;
import java.util.Scanner;

public class Practice7 {
    public static void main( String[] args ){
        /*Practice 7
        Code the program that displays the status of a number "EVEN" or "ODD". */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if(num%2==0)
        System.out.println("EVEN");
        else
        System.out.println("ODD");

        scan.close();

    }

}
