/* Write a program that takes two numbers as input from keyboard and display the result of division. Write internal documentation (proper name, indenting and comments). */

// import Scanner library
import java.util.Scanner;

class Division {
  public static void main(String[] args) {
    // open a new scanner to read the input
    Scanner scanner = new Scanner(System.in);
    // display the message for user to input
    System.out.println("Enter a number");
    // declare a virable to store the input data
    float num1 = scanner.nextFloat();
    System.out.println("Enter another number");
    // declare a virable to store the input data
    float num2 = scanner.nextFloat();
    // close the scanner
    scanner.close();
    // declare a vriable to store the division result
    float result = num1 / num2;
    System.out.println(num1 + " / " + num2 + " = " + result);
  }
}
