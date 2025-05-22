package classes;

import java.util.Scanner;

public class JvaTest {
    public void displayMessage( String studentsName ) {
        System.out.println("You can start doing your java certification test! All the Best ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        JvaTest myJavaTest = new JvaTest();

        System.out.print("Enter your full name:  ");
        String studentsName = input.nextLine();
        System.out.println();

        myJavaTest.displayMessage( studentsName );
    }
}
