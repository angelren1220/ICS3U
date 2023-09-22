/* Homework
 * 6. Write a program that will allow a user to enter two
numbers, then determine whether at least one of the
numbers is greater than 100 using a logical operator
and display the answer as true or false.
 */

import java.util.Scanner;

class Logic {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter another integer: ");
    int num2 = scanner.nextInt();
    scanner.close();
    System.out.println((num1 > 100)||(num2 > 100));
  }
}
