import java.util.Scanner;
import java.lang.Math;

class CalculateArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose a shape:");
    System.out.println("1. Renctangle");
    System.out.println("2. Circle");
    int option = scanner.nextInt();

    switch (option) {
      case 1:
        System.out.println("Rectangle");
        System.out.println("Enter width:");
        float width = scanner.nextFloat();
        System.out.println("Enter height:");
        float height = scanner.nextFloat();
        float renctangleArea = width * height;
        System.out.println("Area is " + renctangleArea);
        break;

      case 2:
        System.out.println("Circle");
        System.out.println("Enter radius:");
        float radius = scanner.nextFloat();
        float circleArea = (float)(Math.PI * Math.pow(radius, 2));
        System.out.println("Area is " + circleArea);
        break;

      default:
        System.out.println("Wrong option");
    }

    scanner.close();

  }
}
