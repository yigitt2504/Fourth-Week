package controlstructures1;
import java.util.Scanner;

public class Practice6 {
    public static void main( String[] args ){
        /*Practice  6
        Code the program that displays the letter grades of the students' grades in the 100-point system. */

        Scanner scan = new Scanner(System.in);
        int grade;

        do{
            System.out.println("Please enter the grade: ");
            grade = scan.nextInt();
        }while(grade < 0 || grade > 100);

        if(grade>=90)
        System.out.println("AA");
        else if(grade>=80)
        System.out.println("BA");
        else if(grade>=70)
        System.out.println("BB");
        else if(grade>=60)
        System.out.println("CB");
        else if(grade>=50)
        System.out.println("CC");
        else if(grade>=40)
        System.out.println("DC");
        else if(grade>=30)
        System.out.println("DD");
        else if(grade>=20)
        System.out.println("FD");
        else
        System.out.println("FF");

    }

}
