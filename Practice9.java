package controlstructures1;
import java.util.Scanner;

public class Practice9 {
    public static void main( String[] args ){
        /*Practice 9
        Code the program that displays the result of the operation entered by the user at once.("+"-->summation, "-"-->subtraction, "*"-->multiplication, "/"-->division) */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter an operation symbol: ");
        char opr = scan.next().charAt(0);
        System.out.println("Enter a number: ");
        double num2 = scan.nextDouble();

        double result;

        switch(opr){
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if(num2!=0){
                    result = num1 / num2;
                System.out.println("The result is: " + result);
                }
                else {
                    System.out.println("Error: Division by zero. ");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        } 
        scan.close();

    }
}
