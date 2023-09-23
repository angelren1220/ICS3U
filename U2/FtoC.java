/* Write a program to convert the temperature from Fahrenheit to Celcius as per the following formula C = 5(F-32)/9. You assign a value to F in the program and then calculate and display the result.   */
import java.util.Scanner;

class FtoC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Fahrenheit degree");
    float f = scanner.nextFloat();
    scanner.close();
    float c = 5 * (f - 32) / 9;
    System.out.println(f + "°F = " + c + "°C");

  }
}
