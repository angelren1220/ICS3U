/* Write a program that will assign two numbers to two
variables and then compute and display the result of
addition, subtraction, multiplication and division of the two
numbers. Also write comments in the program. */
import java.util.Scanner;

class exercise5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    float num1 = scanner.nextFloat();
    System.out.println("Enter another number:");
    float num2 = scanner.nextFloat();
    float result = (num1 + num2) * 2 / 9;
    scanner.close();
    System.out.println("The result is" + result);
  }
}
