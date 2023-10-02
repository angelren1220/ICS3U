import java.util.Scanner;
import java.lang.Math;

class CalculateArea {
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
        float height1 = scanner.nextFloat();
        float rectangleArea = rectangleArea(height1, width);
        System.out.println("Area is " + rectangleArea);
        break;

      case 2:
        System.out.println("Circle");
        System.out.println("Enter radius:");
        float radius = scanner.nextFloat();
        float circleArea = circleArea(radius);
        System.out.println("Area is " + circleArea);
        break;

      case 3:
        System.out.println("Triangle");
        System.out.println("Enter height:");
        float height2 = scanner.nextFloat();
        System.out.println("Enter base:");
        float base = scanner.nextFloat();
        float triangleArea = triangleArea(height2, base);
        System.out.println("Area is " + triangleArea);
        break;

      default:
        System.out.println("Wrong option");
    }

    scanner.close();

  }

  public static float rectangleArea(float h, float w){
    return w * h;
  }

  public static float circleArea(float r){
    return (float) (Math.PI * Math.pow(r, 2));
  }

  public static float triangleArea(float h, float b){
    return h * b / 2;
  }


}
