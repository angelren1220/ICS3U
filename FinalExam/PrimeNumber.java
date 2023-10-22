import java.util.Scanner;

class PrimeNumber {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = scanner.nextInt();
    
    if(number > 0){
      isPrime(number);
    } else {
      System.out.println("Need positive number");
    }

    scanner.close();
  }
  public static void isPrime(int number){
    int sum = 0;

    for(int i = 1; i <= number; i ++){
      if(number % i == 0){
        sum ++;
      }
    }

    if (sum == 2) {
      System.out.println(number + " is a prime number");
    } else {
      System.out.println(number + " is not a prime number");
    }
  }
}