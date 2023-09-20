/* Write a program to calculate the expression. (2xy)÷(3z-2) and output the result to screen. The program
will assign the values of x, y and z before the
calculation. Also write comments in the program. */
import java.util.Scanner;

class exercise7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number x:");
    float x = scanner.nextFloat();
    System.out.println("Enter a number y:");
    float y = scanner.nextFloat();
    System.out.println("Enter a number z:");
    float z = scanner.nextFloat();
    float result = (2 * x * y) / (3 * z - 2);
    scanner.close();
    System.out.println("The result is" + result);
  }
}
