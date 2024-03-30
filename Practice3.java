package controlstructures1;
import java.util.Scanner;

public class Practice3 {
    public static void main( String[] args ){
        /*Practice 3
        Code the program that determines and display the name of the weekday according to the number entered by the user.(1=Monday...7=Sunday) */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a day number(1-7): ");
        int weekday = scan.nextInt();

        if(weekday==1)
        System.out.println("Monday");
        else if(weekday==2)
        System.out.println("Tuesday");
        else if(weekday==3)
        System.out.println("Wednesday");
        else if(weekday==4)
        System.out.println("Thursday");
        else if(weekday==5)
        System.out.println("Friday");
        else if(weekday==6)
        System.out.println("Saturday");
        else if(weekday==7)
        System.out.println("Sunday");


        scan.close();

    }

}
