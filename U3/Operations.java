import java.util.Scanner;

class Operations {
  public static void main(String[] arg) { // non-static or local variable

    Scanner myObj = new Scanner(System.in);
    System.out.println("enter Value 1");
    int x = myObj.nextInt();
    System.out.println("enter Value 2");
    int y = myObj.nextInt();

    myObj.close();

    int answer = Add(x, y);

    System.out.println("Sum of two values : " + answer);

    answer = Mutiplication(x, y);

    System.out.println("Multiplication  of two values : " + answer);

    answer = Subtraction(x, y);

    System.out.println("Substraction of two values : " + answer);

    answer = Division(x, y);

    System.out.println("Division of two values : " + answer);

  }

  public static int Add(int x, int y) {
    // return is the keyword which through the value to main program variable
    return x + y;
  }

  public static int Mutiplication(int x, int y) {
    return x * y;

  }

  // Add Subtraction method
  public static int Subtraction(int x, int y) {
    return x - y;
  }

  // Add Division method
  public static int Division(int x, int y) {
    return x / y;
  }
}
