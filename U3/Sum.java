/* Write a program that will allow a user to enter a number, then calculate and display the sum of the odd numbers from 1 to the entered number.	 */

import java.util.Scanner;

class Sum {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = scanner.nextInt();

    scanner.close();

    int result = sum(number);
    System.out.println("Sum of "+number +" is "+ result);
  }

  public static int sum(int n){
    int sum = 0;
    for(int i = 0; i <= n; i++){
      sum += i;
    }
    return sum;
  }
}
