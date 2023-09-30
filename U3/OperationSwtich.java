import java.util.Scanner;

class OperationSwtich {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter one number");
    int num1 = scanner.nextInt();
    System.out.println("Enter another number");
    int num2 = scanner.nextInt();

    System.out.println("Choose an operation to perform");
    System.out.println("1. +");
    System.out.println("2. -");
    System.out.println("3. *");
    System.out.println("4. /");

    int operation = scanner.nextInt();
    scanner.close();

    int result;
    switch (operation) {
      case 1:
        result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
        break;

      case 2:
        result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
        break;

      case 3:
        result = num1 + num2;
        System.out.println(num1 + "*" + num2 + "=" + result);
        break;

      case 4:
        result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result);
        break;

      default:
        System.out.println("Wrong input");
    }
  }
}
