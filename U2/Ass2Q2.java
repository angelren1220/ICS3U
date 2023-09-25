/* Write a program that will allow a user to enter the length of three sides of a triangle as a String type data. Then the program will convert the data to integer typed data and determine whether the triangle is valid or not. */
import java.util.Scanner;

class Ass2Q2 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter side a");
    int a = Integer.parseInt(scanner.nextLine());
    System.out.println("Enter side b");
    int b = Integer.parseInt(scanner.nextLine());
    System.out.println("Enter side c");
    int c = Integer.parseInt(scanner.nextLine());
    scanner.close();

    if(((a + b) > c) && ((b + c) >a) && ((a + c) > b)){
      System.out.println(a + "," + b + "," + c + " can form a valid triangle");
    } else {
      System.out.println(a + "," + b + "," + c + " cannot form a valid triangle");
    }
    System.out.println(a);

  }
}
