/* Write a method in a program that will ask user to enter the daily sales amount for a week and store them in an array. Then the program will calculate and display the total sales of the week and the average sales per day in the week.  */

import java.util.Scanner;

class WeekSales {
  public static void main(String[] args){

    // open the scanner to read the input
    Scanner scanner = new Scanner(System.in);

    // declare and initialize a float array
    float[] dailySales = new float[7];

    // use for loop to store user's input in array
    for(int i = 0; i < dailySales.length; i ++){
      System.out.println("Enter daily sales amount:");
      float dailySale = scanner.nextInt();
      dailySales[i] = dailySale;
    }

    // close the scanner
    scanner.close();

    // call method to calculate average
    float result = average(dailySales);

    // display the the result
    System.out.println("The average daily sales amount is $" + result);
    
  }
  
  public static float average(float[] arr){

    // calulate the the sum of array elements
    float sum = 0;

    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    // calulate the average
    float average = sum / arr.length;

    return average;
  }
}
