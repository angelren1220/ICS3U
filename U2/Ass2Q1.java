/* Write a program to evaluate the expression	  . The program must allow user to enter the value of x, y and z and display the result after evaluating the expression.  */
import java.util.Scanner;

class Ass2Q1 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter x:");
    float x = scanner.nextFloat();
    System.out.println("Enter y:");
    float y = scanner.nextFloat();
    System.out.println("Enter z:");
    float z = scanner.nextFloat();
    scanner.close();
    float result = (x - y)/(2 * z) + 4 * y * z;
    System.out.println("The result is " + result);

  }
}
