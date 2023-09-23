/* Write a program that will allow a user to enter two numbers, then determine whether the first number is smaller than the second number using a comparison operator and display the answer as true or false.	 */
import java.util.Scanner;

class SmallerThan {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int num1 = scanner.nextInt();
    System.out.println("Enter another number");
    int num2 = scanner.nextInt();
    scanner.close();
    System.out.println(num1 < num2);
  }
}
