/* Write a program in Java that will ask and allow user to
enter first name, last name and two marks from keyboard,
store them in proper variables and display full name and
average mark using the variables. */

import java.util.Scanner;

class Hmwk6 {
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
    System.out.println("Enter a mark:");
    float mark1 = scanner.nextFloat();
    System.out.println("Enter another mark:");
    float mark2 = scanner.nextFloat();
    float average = (mark1 + mark2) * 2 / 9;
    // close the scanner
    scanner.close();
    // display the user's age
    System.out.println(firstName + " " + lastName +"'s average marks: " + average);
  }
}