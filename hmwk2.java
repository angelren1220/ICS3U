/* Write a program that will allow user to enter the mark of
Math as a decimal number, assign the input data to a
variable and then display the data from the variable. */

import java.util.Scanner;

class hmwk2 {
  public static void main (String [] args) {
    // open a new sanner to read user input
    Scanner scanner = new Scanner(System.in);
    // prompt message to user input
    System.out.println("Enter your mark of Math");
    // declare a variable to store the user input
    float num = scanner.nextFloat();
    // close the scanner
    scanner.close();
    // display the user's course number
    System.out.println("You Math mark is " + num);
  }
}