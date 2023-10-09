/* A teacher wants to manage marks of students by using a computer program. Write a program that will ask user and store marks entered by user in an array. Write a method that will take the array with marks, count and display the number of students who got 80 or more marks. */

import java.util.Scanner;

class Marks {
  public static void main(String[] args){

    float[] marks = inputData();
    int result = sum(marks, 80);

    System.out.println("Number of students who got 80 or more marks: " + result);

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
    ;

    // return the array
    return data;
  }

  /*
   * Method: sum
   * calculate the sum of elements that greater than a number
   * parameter: an array, a number
   * return: sum
   */
  public static int sum(float[] array, float number){
    int sum = 0;

    for(int i = 0; i < array.length; i++){
      if(array[i] >= number){
        sum ++;
      }
    }

    return sum;
  }
 
}
