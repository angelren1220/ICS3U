/* Write a program in Java that will ask and allow
user to enter first name and last name from
keyboard, store them in two variables and display
full name from one variable. */

import java.util.Scanner;

class Exercise3 {
  public static void main (String [] args) {
    // open a new sanner to read user input
    Scanner scanner = new Scanner(System.in);
    // prompt message to user input
    System.out.println("Enter your first name:");
    // declare a variable to store the user input
    String firstName = scanner.nextLine();
    System.out.println("Enter your last name:");
    // declare a variable to store the user input
    String lastName = scanner.nextLine();
    // close the scanner
    scanner.close();
    // display the user's age
    System.out.println("Hello " + firstName + " " + lastName);
  }
}