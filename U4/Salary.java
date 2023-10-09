/* Write a method in a Java program that will allow users to enter the salaries of the employees in a company, store them in an array and return the array from the method. Write another method in the program that will take an array with the type of salary data as a parameter, determine the total salary and return the result. The methods need to be called in the main() method so that the program works properly to enter salaries, calculate and display the total salary of the employees in the company. */

import java.util.Scanner;

class Salary {
  public static void main(String[] args) {

    float[] salaries = inputData();
    float totalSalary = sum(salaries);
    System.out.println("Totoal salary: $" + totalSalary);

  }

  /*
   * Method: inputData
   * parameter: none
   * return: array of input data
   */
  public static float[] inputData() {

    // open a new scanner to read input
    Scanner scanner = new Scanner(System.in);

    // decalre and initialize an array to store data
    float[] data = new float[10];

    // use for loop to read each input and store it in array
    for (int i = 0; i < data.length; i++) {
      System.out.println("Enter data:");
      data[i] = scanner.nextFloat();
    }

    // close the scanner
    scanner.close();

    // return the array
    return data;
  }

  /*
   * Method: sum
   * parameter: array
   * return: sum of the array elements
   */
  public static float sum(float[] array) {

    // declare the sum and initialize it as 0
    float sum = 0;

    // use for loop to calculate the sum
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    // return the result
    return sum;
  }
}
