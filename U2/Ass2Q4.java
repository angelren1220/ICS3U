/* Write a program that will determine whether a customer’s credit limit is exceeded at the end of each month. The program must allow user to enter the account number, balance at the beginning of the month, total charges, total credits and the credit limit. Then the program will calculate the new balance which is equal to the beginning balance plus total charges minus total credits and display the new balance. If the new balance exceeds the credit limit a message like “Credit limit exceeded by the amount $326.34” must be displayed. */
import java.util.Scanner;

class Ass2Q4 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter account number");
    String accountNumber = scanner.nextLine();
    System.out.println("Enter balance");
    float balance = scanner.nextFloat();
    System.out.println("Enter total charges");
    float totalCharges = scanner.nextFloat();
    System.out.println("Enter total credits");
    float totalCredits = scanner.nextFloat();
    System.out.println("Enter credit limit");
    float creditLimit = scanner.nextFloat();
    scanner.close();
    float newBalance = balance + totalCharges - totalCredits;
    System.out.println("Account number: " + accountNumber);
    System.out.printf("New balance: $%.2f", newBalance);
    float exceededAmount = newBalance - creditLimit;
    if(exceededAmount > 0){
      System.out.printf("Credit limit exceeded by the amount $%.2f", exceededAmount);
    }

  }
}
