// Write a program that will take a number as an input from user, calculate factorial of the number and display the result. The factorial is the product of the integers between 1 and that number. You have to write a method to calculate factorial and call the method in the main method. 

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = scanner.nextInt();

    int result = factorial(number);

    System.out.println(number + "! = " + result);
  }

  public static int factorial(int number){
    int product = 1;

    for(int i = 1; i <= number; i++){
      product *= i;
    }

    return product;
  }
}
