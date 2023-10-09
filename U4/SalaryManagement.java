/* A company wants to manage the employee’s salary amount using computer. Write a program that will ask user how many employee’s salary they want to keep. Then the program needs to ask the user to enter the amount of salary. The salary amount needs to be stored in an array with the size of the number of employees.   After taking the salary information the program have to calculate the total salary by a method and display the total salary amount. Write another method to display the salary of each employee. Call the methods so that the program works. */

import java.util.Scanner;

class SalaryManagement {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of employees: ");

    int numberOfEmployees = scan.nextInt();
    
    float[] salaries = inputData(scan, numberOfEmployees);
    
    float totalSalary = sum(salaries);
    System.out.println("Total salary: $" + totalSalary);
    
    System.out.println("Salary of each employee:");
    printAll(salaries);
    
    scan.close();
  }

  /*
   * Method: inputData
   * create an array with input number slots;
   * read and store input data to array
   * parameter: a number
   * return: array of input data
   */
  public static float[] inputData(Scanner scanner, int number) {

    float[] data = new float[number];

    for (int i = 0; i < data.length; i++) {
      System.out.println("Enter data:");
      data[i] = scanner.nextFloat();
    }

    return data;
  }

  /*
   * Method: sum
   * calculate sum of elements of an array
   * parameter: an array
   * return: a sum
   */
  public static float sum(float[] array){
    float sum = 0;

    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }

    return sum;
  }

  /*
   * Method: printAll
   * print all elements of the input array
   * parameter: an array
   * return: none
   */
  public static void printAll(float[] array){
    for(int i = 0; i < array.length; i ++){
      System.out.println("$" + array[i]);
    }
  }

}
