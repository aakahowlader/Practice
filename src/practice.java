import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner myScanner= new Scanner(System.in);
        System.out.println("what is your first name i am adding this new line here" );
        String firstName = myScanner.nextLine();
        System.out.println("your first name is:  " + firstName);


        System.out.println("Enter the course fee");
        double courseFee = myScanner.nextDouble();
        System.out.println("the course fee is: "+ courseFee);


        System.out.println("How old are you");
        int myAge = myScanner.nextInt();
        System.out.println("my age is "+ myAge);

        myScanner.close();




    }




}
