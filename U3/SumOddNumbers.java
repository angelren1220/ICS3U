/* Write a non-static method in a program that will calculate and display the sum of the series 1+3+5+…….+ N. The program must ask user to enter the value of N as an odd number and call the method in main() so that it executes.  */

import java.util.Scanner;

class SumOddNumbers {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an odd number");
    int number = scanner.nextInt();
    scanner.close();

    Helper h = new Helper();
    h.sumOddNumbers(number);
  }
}

class Helper {
  public void sumOddNumbers(int n){
    int sum = 0;

    for(int i = 1; i < n + 1; i+=2){
      sum += i;
    }

    System.out.println("Sum of 1 + 3 + ... + " + n + " is " + sum);
  }
}
