import java.util.Scanner;

public class mentoringPractice {

    // 1. print the sum of two numbers
    // 74+ 36
    //expected output: 110

    //2. divide two numbers and print it on the screen
    //test data: 50/3
    //expected data: 16

    //3. print the results of the following operations:
    //a) -5+8*6
    //b) (55+9) % 9
    //c) 20+-3*5/8
    //d) 5+15/3*2-8%3

    //5. write a java program that takes input of two numbers and displays the product of the two numbers

    //6. print the sum, multiply, subtract, divide and remaninder of two numbers

    //7. takes  number as input and prints its multiplication table up to 10

    //9.compute the specified formula: 4.0 * (1-(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
    //expected output: 2.97604...

    //11. print the area and perimeter of a circle

    //12. write a java program that takes three numbers as input to calculate and print the average of the numbers

    //13. Write a java program to print the area and perimeter of a rectangle

    //14. swap two variables

    //15. Print the odd numbers from 1 to 99

    //16. accepts an integer (n) and computes the value of n+nn+nn

    //17.   Twinkle twinkle little star,
    //          How I wonder what you are!
    //              up above the world so high,
    //              Like a diamond in the sky.
    //Twinkle twinkle, little star,
    //      How I wonder what you are

    //18. Write a Java program to reverse a string

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string:  ");
        for (int i = letters.length -1; i >=0; i--) {
            System.out.println(letters[i]);
        }

        System.out.println("/n");

    }







}
