import java.util.Scanner;

class Factorial {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter N");
    int n = scanner.nextInt();

    scanner.close();

    int result = factorial(n);
    System.out.println(n + "! = " + result);
  }
  
  public static int factorial(int n) {
    int factorial = 1;
  
    for(int i = 1; i <= n; i++){
      factorial *= i;
    }

    return factorial;

  }
}
