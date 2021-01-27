import java.util.Scanner;

public class InputPractice {

    public static void main(String[] args) {

        //write a java program that takes two numbers as input and display the product of two numbers
        //test data: input first number: 25
        //           input second number: 5
        //expected output: 25 x 5 = 125

        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter first number");
        int n1= myScanner.nextInt();
        System.out.println("Enter the second number");
        int n2= myScanner.nextInt();
        System.out.println("your product is:  " + n1*n2 );
        myScanner.close();



    }

}
