/* Write a program that will ask user “How many courses
have you taken this term? The program will allow an user to
enter the answer and assign the input data to a variable
and then display the data from the variable. */

import java.util.Scanner;

class hmwk1 {
  public static void main (String [] args) {
    // open a new sanner to read user input
    Scanner scanner = new Scanner(System.in);
    // prompt message to user input
    System.out.println("How many courses have you taken this term?");
    // declare a variable to store the user input
    int num = scanner.nextInt();
    // close the scanner
    scanner.close();
    // display the user's course number
    System.out.println("You have " + num + "courses");
  }
}