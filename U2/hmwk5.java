/* Write a program to convert the temperature from
Fahrenheit to Celcius as per the following formula.
C = 5(F-32)/9 */

import java.util.Scanner;

class Hmwk5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a Fahrenheit degree:");
    float f = scanner.nextFloat();
    float c = 5 * (f -32) / 9;
    scanner.close();
    System.out.println(f + "°F = " + c + "°C");
  }  
}
