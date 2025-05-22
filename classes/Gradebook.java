package classes;
import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        int grade;
        System.out.print("Enter a grade: ");
        grade = input.nextInt();

        if ( grade >= 60 )
           System.out.println("Passed");
        else
           System.out.println( "Failed" ); 
    }
}