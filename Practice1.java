package controlstructures1;
import java.util.Scanner;

public class Practice1 
{
    public static void main( String[] args )
    {
        /*Practice 1
        Code the program that displays the status of the numbers entered by the user "greater than or equals to 50" or "less than 50" until the user enters zero. */

        Scanner input=new Scanner(System.in);

        int i=input.nextInt();
        
        while(i!=0){
            if(i<50)
                System.out.printf("The number is less than 50.\n");
            else
                System.out.printf("Greater than or equals to 50.\n");
            System.out.printf("Please enter another number to check.\n");
            i=input.nextInt();
        }
        input.close();
        
    }
}
