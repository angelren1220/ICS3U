import java.util.Scanner;

class SumEvenNumbers {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an even number N");
    int n = scanner.nextInt();

    scanner.close();

    int sum = 0;

    for(int i = 2; i < n + 1; i+=2 ){
      sum += i;
    }

    System.out.println("The sum is " + sum);
  }
}
