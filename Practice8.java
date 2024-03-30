package controlstructures1;
import java.util.Scanner;

public class Practice8 {
    public static void main( String[] args ){
        /*Practice 8
        Code the program that finds and displays whether a character entered by the user is a "Vowel" or a "Consonant". */

        Scanner scan = new Scanner(System.in);

        System.out.println("Pllease enter a character: ");
        char ch = scan.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        System.out.println("Vowel");
        else System.out.println("Consonant");
        
    }
}
