/* Write a program that will allow a user to enter
two numbers, then determine whether they are
equal or not using the equal operator and display
the answer as true or false. */

import java.util.Scanner;

class Equal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int num1 = scanner.nextInt();
    System.out.println(("Enter another integer"));
    int num2 = scanner.nextInt();
    scanner.close();
    System.out.println(num1 == num2);
  }
}
