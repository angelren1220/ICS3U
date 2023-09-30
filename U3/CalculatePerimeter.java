/* Write a program that will allow user to enter option 1 for a triangle, or 2 for a rectangle or 3 for a circle.  According to the option entered by the user the program will allow the user to enter the dimension of the shape 	and then calculate the perimeter of the shape. You must use switch structure to calculate the perimeter	according to the option entered by the user. */

import java.util.Scanner;
import java.lang.Math;

class CalculatePerimeter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose a shape:");
    System.out.println("1. Renctangle");
    System.out.println("2. Circle");
    System.out.println("3. Triangle");
    int option = scanner.nextInt();

    switch (option) {
      case 1:
        System.out.println("Rectangle");
        System.out.println("Enter width:");
        float width = scanner.nextFloat();
        System.out.println("Enter height:");
        float height = scanner.nextFloat();
        float rectanglePerimeter = (width + height) * 2;
        System.out.println("Perimeter is " + rectanglePerimeter);
        break;

      case 2:
        System.out.println("Circle");
        System.out.println("Enter radius:");
        float radius = scanner.nextFloat();
        float circlePerimeter = (float) (Math.PI * radius * 2);
        System.out.println("Perimeter is " + circlePerimeter);
        break;

      case 3:
        System.out.println("Triangle");
        System.out.println("Enter side length a:");
        float a = scanner.nextFloat();
        System.out.println("Enter side length b:");
        float b = scanner.nextFloat();
        System.out.println("Enter side length c:");
        float c = scanner.nextFloat();
        float trianglePerimeter = a + b + c;
        System.out.println("Perimeter is " + trianglePerimeter);
        break;

      default:
        System.out.println("Wrong option");
    }

    scanner.close();

  }
}
