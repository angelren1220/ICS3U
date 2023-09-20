/* Write a program that will ask user to enter
his/her age, store input data in a variable and
then display the data with proper text. */

import java.util.Scanner;

class Exercise1 {
  public static void main (String [] args) {
    // open a new sanner to read user input
    Scanner scanner = new Scanner(System.in);
    // prompt message to user input
    System.out.println("Enter your age:");
    // declare a variable to store the user input
    int age = scanner.nextInt();
    // close the scanner
    scanner.close();
    // display the user's age
    System.out.println("Your age is " + age);
  }
}