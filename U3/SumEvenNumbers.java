/* Write a static method in a program that will calculate and display the sum of the series 2+4+6+…….+ N. The program must ask user to enter the value of N as an even number.  */

import java.util.Scanner;

class SumEvenNumbers {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an even number N");
    int n = scanner.nextInt();
    scanner.close();

    sumEvenNumbers(n);
  }
  
  public static void sumEvenNumbers(int n){
    int sum = 0;
  
    for(int i = 2; i < n + 1; i+=2 ){
      sum += i;
    }
  
    System.out.println("The sum is " + sum);
    
  }
}
